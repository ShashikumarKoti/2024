package com.skoti.multithreading.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample1 {

    public static void main(String[] args) {

        Lock reentrantLock1 = new ReentrantLock();
        Lock reentrantLock2= new ReentrantLock();

        Runnable1 runnable1 = new Runnable1(reentrantLock1,reentrantLock2);
        Runnable2 runnable2 = new Runnable2(reentrantLock1,reentrantLock2);

        Thread thread1 = new Thread(runnable1, "Thread:1");
        Thread thread2 = new Thread(runnable2, "Thread:2");

        thread1.start();
        thread2.start();
    }
}
