package org.example;

public class PriorityThread implements Runnable{
    int time;
    PriorityThread() {

    }
    PriorityThread(int time) {
        this.time = time;
    }
    @Override
    public void run() {
        try {
            for (int i=1; i<=3; i++) {
                Thread.sleep(time);
                System.out.println(Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception Occur");
        }

    }

    public static void main(String[] args) {
        Thread t = new Thread(new PriorityThread(2000));
        Thread t1 = new Thread(new PriorityThread(5000));
        Thread t2 = new Thread(new PriorityThread(3000));
        // BY DEFAULT PRIORITY IS 5
        // NORM_PRIORITY, MIN_PRIORITY, MAX_PRIORITY
        System.out.println(t.getName() + "'s Priority = "+t.getPriority());
        System.out.println(t1.getName() + "'s Priority = "+t1.getPriority());
        System.out.println(t2.getName() + "'s Priority = "+t2.getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(7);
        System.out.println("After Resetting Priority");
        System.out.println(t.getName() + "'s Priority = "+t.getPriority());
        System.out.println(t1.getName() + "'s Priority = "+t1.getPriority());
        System.out.println(t2.getName() + "'s Priority = "+t2.getPriority());
        t1.start();
        t1.yield();
        t.start();
        t2.start();
    }
}
