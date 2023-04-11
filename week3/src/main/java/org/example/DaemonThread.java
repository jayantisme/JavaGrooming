package org.example;

public class DaemonThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThread(), "DaemonThread");
        t.setDaemon(true);
        t.start();
        System.out.println(t.getName()+" "+" is daemon thread ? "+t.isDaemon());
        System.out.println(Thread.currentThread().getName()+" "+" is daemon thread ? "+Thread.currentThread().isDaemon());
    }
}
