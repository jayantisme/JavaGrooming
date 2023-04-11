package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    static List<Integer> list = new ArrayList<>();
    static class Producer implements Runnable {
        List<Integer> list;
        Producer(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            synchronized (list) {
                for (int i=1; i<=2; i++) {
                    if (list.size() >= 1) {
                        try {
                            //System.out.println("Producer Is Waiting");
                            list.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Producer Produced - " + i);
                    list.add(i);
                    list.notifyAll();
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Consumer implements Runnable {
        List<Integer> list;

        Consumer(List<Integer> list) {
            this.list = list;
        }

        @Override
        public void run() {
            synchronized (list) {
                for (int i = 1; i <= 2; i++) {
                    while (list.isEmpty()) {
                        try {
                           // System.out.println("Consumer Is Waiting");
                            list.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    int value = list.remove(0);
                    System.out.println("Consumer Consumed - " + value);
                    list.notifyAll();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread producer = new Thread(new Producer(list));
        Thread consumer =  new Thread(new Consumer(list));
        producer.start();
        consumer.start();
    }
}
