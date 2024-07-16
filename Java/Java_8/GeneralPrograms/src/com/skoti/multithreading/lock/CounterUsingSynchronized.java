package com.skoti.multithreading.lock;

public class CounterUsingSynchronized {

    private long count = 0;

    public synchronized void increment() {
        this.count++;
    }
    public synchronized long getCount() {
        return this.count;
    }
}
