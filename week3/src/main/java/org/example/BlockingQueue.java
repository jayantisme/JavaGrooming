package org.example;

import java.util.LinkedList;
import java.util.Queue;

class CustomBlockingQueue<T> {

    private Queue<T> queue = new LinkedList<>();
    private int capacity;

    public CustomBlockingQueue(int capacity) {
        // Setting the maximum capacity for the queue
        this.capacity = capacity;
    }

    public synchronized void put(T element) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.offer(element);
        notifyAll();
    }

    public synchronized T take() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        T element = queue.poll();
        notifyAll();
        return element;
    }
}

class ProdConsumer {

    CustomBlockingQueue<Integer> blockingQueue;
    int producedCount = 0;
    int consumedCount = 0;

    public ProdConsumer(CustomBlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void produce() throws InterruptedException {
        while (true) {
            if (producedCount == 10) break;
            blockingQueue.put(1);
            System.out.println("Item produced");
            producedCount++;
            Thread.sleep(1000);
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            if (consumedCount == 10) break;
            blockingQueue.take();
            System.out.println("Item consumed");
            consumedCount++;
            Thread.sleep(3000);
        }
    }


}


public class BlockingQueue {

    public static void main(String[] args) {

        CustomBlockingQueue<Integer> blockingQueue = new CustomBlockingQueue<>(5);
        ProdConsumer producerConsumer = new ProdConsumer(blockingQueue);
        Thread producerThread = new Thread(() -> {

            try {
                producerConsumer.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        Thread consumerThread = new Thread(() -> {

            try {
                producerConsumer.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });
        producerThread.start();
        consumerThread.start();


    }
}
