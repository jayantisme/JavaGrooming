package org.example;

public class Task {
    public static void main(String[] args) {
        Runnable myTask = () -> {
            try {
                System.out.println("This is my first task.");
                Thread.sleep(1000);
                System.out.println("I used Runnable.");
                Thread.sleep(1000);
                System.out.println("Also, I used lambda exp.");
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception Occur.");
            }
        };
        Thread t = new Thread(myTask);
        t.start();
    }
}
