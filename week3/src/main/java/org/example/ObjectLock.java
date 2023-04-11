package org.example;

public class ObjectLock implements Runnable{
    @Override
    public void run() {
        objectLock();
    }
    public void objectLock() {
        System.out.println(Thread.currentThread().getName());
        synchronized (this) {
            System.out.println("Sync Block " + Thread.currentThread().getName());
            System.out.println("Sync Block " + Thread.currentThread().getName()+" end");
        }
    }

    public static void main(String[] args) {
        ObjectLock obj = new ObjectLock();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        ObjectLock obj1 = new ObjectLock();
        Thread t3 = new Thread(obj1);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
