package com.skoti.multithreading.basics;

public class Example3 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread started " + Thread.currentThread().getName());
                System.out.println("Thread finished " + Thread.currentThread().getName());
            }
        };
        new Thread(runnable).start();
        Thread.sleep(500);
        System.out.println("Main finished " + Thread.currentThread().getName());
    }
}
