package com.skoti.multithreading.basics;public class Example1 {

    static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("Thread started " + Thread.currentThread().getName());
            System.out.println("Thread finished " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());
        MyThread myThread= new MyThread();
        myThread.start();
        Thread.sleep(500);
        System.out.println("Main finished " + Thread.currentThread().getName());

    }
}
