package com.skoti.multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterUsingLock {

    private long count = 0;

    private Lock lock = new ReentrantLock();

    public void increment() {
        try {
            lock.lock();
            this.count++;
        } finally {
            lock.unlock();
        }
    }

    public long getCount() {
        try {
            lock.lock();
            return this.count;
        } finally {
            lock.unlock();
        }
    }
}
