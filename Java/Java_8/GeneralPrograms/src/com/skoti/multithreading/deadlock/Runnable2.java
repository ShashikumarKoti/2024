package com.skoti.multithreading.deadlock;

import java.util.concurrent.locks.Lock;

public class Runnable2 implements Runnable {

    private final Lock lock1;
    private final Lock lock2;

    public Runnable2(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " attempting to lock lock2");
        lock2.lock();
        System.out.println(threadName + " acquired lock2");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(threadName + " attempting to lock lock1");
        lock1.lock();
        System.out.println(threadName + " acquired lock1");

        //do the work
        //now unlock
        System.out.println(threadName + " unlocking lock1");
        lock1.unlock();
        System.out.println(threadName + " unlocking lock2");
        lock2.unlock();


    }
}
