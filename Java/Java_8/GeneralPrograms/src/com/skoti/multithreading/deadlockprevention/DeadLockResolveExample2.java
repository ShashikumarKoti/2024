package com.skoti.multithreading.deadlockprevention;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockResolveExample2 {

    //Approach 2: Timeout method
    public static void main(String[] args) {

        Lock reentrantLock1 = new ReentrantLock();
        Lock reentrantLock2= new ReentrantLock();

        Runnable runnable1 = new Runnable1Timeout(reentrantLock1,reentrantLock2);
        Runnable runnable2 = new Runnable2Timeout(reentrantLock1,reentrantLock2);

        Thread thread1 = new Thread(runnable1, "Thread:1");
        Thread thread2 = new Thread(runnable2, "Thread:2");

        thread1.start();
        thread2.start();
    }
}
