package com.skoti.multithreading.virtualthreads;

public class MyRunnable2 implements Runnable {

    private int count = 0;
    Object obj = null;

    MyRunnable2(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {

        System.out.println(obj.hashCode());
        for (int i = 0; i < 100_000; i++) {
            this.count++;
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.count);
    }
}
