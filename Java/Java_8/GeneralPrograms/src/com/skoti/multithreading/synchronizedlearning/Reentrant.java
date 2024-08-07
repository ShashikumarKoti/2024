package com.skoti.multithreading.synchronizedlearning;

public class Reentrant {

    private int count = 0;

    public synchronized void inc() {
        this.count++;
    }

    public synchronized int incAndGet() {
        inc();
        return this.count;
    }
}
