package org.example;

public class Yield extends Thread{

    public void run() {
        for (int i=0; i<5; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName());
        }

    }

    public static void main(String[] args) {
        Yield  t = new Yield();
        Thread t1 = new Thread(new Yield());
        t.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t1.yield();
        t.start();

    }
}
