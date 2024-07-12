package com.skoti.multithreading.virtualthreads;

public class MyRunnable implements Runnable {

    private int count = 0;

    @Override
    public void run() {

        Object obj = new Object();
        System.out.println(obj.hashCode());
        for (int i = 0; i < 100_000; i++) {
            this.count++;
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.count);
    }
}