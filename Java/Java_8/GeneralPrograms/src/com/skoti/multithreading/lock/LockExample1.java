package com.skoti.multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample1 {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock(true);

        lock.lock();
        //do something
        lock.unlock();
    }
}
