package com.skoti.multithreading.virtualthreads;

public class MyRunnable3 implements Runnable {

    private int count = 0;

    @Override
    public void run() {

        for (int i = 0; i < 100_000; i++) {
            synchronized (this) {
                this.count++;
            }
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.count);
    }
}