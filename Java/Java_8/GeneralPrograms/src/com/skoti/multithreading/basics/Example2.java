package com.skoti.multithreading.basics;

public class Example2 {

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread started " + Thread.currentThread().getName());
            System.out.println("Thread finished " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        Thread.sleep(500);
        System.out.println("Main finished " + Thread.currentThread().getName());
    }
}
