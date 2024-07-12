package com.skoti.multithreading.virtualthreads;

public class SeparateObjectsExample3 {

    public static void main(String[] args) {

        Object object = new Object();
        Runnable runnable1 = new MyRunnable2(object);
        Runnable runnable2 = new MyRunnable2(object);

        Thread thread1 = new Thread(runnable1, "Thread 1");
        Thread thread2 = new Thread(runnable2, "Thread 2");
        thread1.start();
        thread2.start();
    }
}
