package org.example;

class MyThread extends Thread {
    public void run() {
        System.out.println("Hello From Thread Extends");
    }
}

public class HelloThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello From My First Thread");
        System.out.println("BEFORE INTERRUPT ---->>>>");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                if (i == 3)
                    Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception Occur");
        }
        System.out.println("AFTER INTERRUPT");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new HelloThread());
        t.start();
        MyThread t2 = new MyThread();
        t2.start();
        if (!t.interrupted())
            t.interrupt();
        System.out.println(t.isInterrupted());
        int[] arr = {1, 2, 3, 4, 5};
        for (int n : arr) {
            Thread.sleep(1000);
            System.out.println(n);
        }

    }
}
