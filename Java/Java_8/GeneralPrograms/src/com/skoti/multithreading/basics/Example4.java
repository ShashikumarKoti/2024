package com.skoti.multithreading.basics;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Runnable runnable = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Thread started " + threadName);
            System.out.println("Thread finished " + Thread.currentThread().getName());
        };
        Thread thread1 = new Thread(runnable, "Lambda thread1");
        thread1.start();

        Thread thread2 = new Thread(runnable, "Lambda thread2");
        thread2.start();

        Thread.sleep(500);
        System.out.println("Finished " + Thread.currentThread().getName());
    }
}
