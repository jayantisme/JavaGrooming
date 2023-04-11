package org.example;

public class DeadLock {
    public static void main(String[] args) {
        String resource1 = "Jayant";
        String resource2 = "Aman";
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1)  {
                    System.out.println("Thread 1, Locked Resource 1!!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2) {
                        System.out.println("Thread 1, Locked Resource 1!!");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run(){
                synchronized (resource2) {
                    System.out.println("Thread 2, Locked Resource 2!!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1) {
                        System.out.println("Thread 2, Locked Resource 2!!");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
