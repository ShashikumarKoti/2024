package com.skoti.multithreading.virtualthreads;

public class SeparateObjectsExample5 {

    public static void main(String[] args) {

        Runnable runnable1 = new MyRunnable3();

        Thread thread1 = new Thread(runnable1, "thread-1");
        Thread thread2 = new Thread(runnable1, "thread-2");
        thread1.start();
        thread2.start();
    }
}
