package org.example;

public class ClassLock implements Runnable{
    @Override
    public void run() {
        classLock();
    }
    public void classLock() {
        System.out.println(Thread.currentThread().getName());
        synchronized (ClassLock.class) {
            System.out.println("Sync Block "+Thread.currentThread().getName());
            System.out.println("Sync Block "+Thread.currentThread().getName()+" end");
        }
    }

    public static void main(String[] args) {
        ClassLock obj1 = new ClassLock();
        ClassLock obj2 = new ClassLock();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
