package org.example;

import java.util.concurrent.*;



class Try implements Callable {
    @Override
    public Object call() throws Exception {
        return "Hi, I'm Callable task.";
    }
}
public class Practice extends Thread {
    @Override
    public void run() {
        for (int i = 1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Practice t = new Practice();
        t.start();

        Runnable myTask = () -> {
            System.out.println("Task " + Thread.currentThread().getName());
        };
        Thread t2 = new Thread(myTask);
        t2.start();

        t.interrupt();


        FutureTask futureTask = new FutureTask<>(new Try());
        Thread tt = new Thread(futureTask);
        tt.start();
        System.out.println(futureTask.get());

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Try());

        Thread daemon = new Thread("DaemonThread");
        daemon.setDaemon(false);
        daemon.start();
        System.out.println(daemon.isDaemon());




    }
}
