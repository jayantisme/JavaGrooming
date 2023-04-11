package org.example;

public class ThreadExec implements Runnable{
    int time;
    ThreadExec() {

    }
    ThreadExec(int time) {
        this.time = time;
    }
    @Override
    public void run() {
//        for (int i=0; i<3; i++){
////            Thread.sleep(2000);
//            System.out.println("Current Thread Name - "+Thread.currentThread().getName());
//        }
        try {
            for (int i=0; i<3; i++){
                Thread.sleep(time);
                System.out.println("Current Thread Name - "+Thread.currentThread().getName()  +"  "+ i);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception Occur");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN THREAD NAME - "+Thread.currentThread().getName());
        Thread t1 = new Thread(new ThreadExec(2000));
        Thread t2 = new Thread(new ThreadExec(1000));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("MAIN THREAD NAME - "+Thread.currentThread().getName());

    }
}
