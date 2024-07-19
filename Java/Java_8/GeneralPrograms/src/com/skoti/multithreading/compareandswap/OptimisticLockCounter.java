package com.skoti.multithreading.compareandswap;

import java.util.concurrent.atomic.AtomicLong;

public class OptimisticLockCounter {

    private AtomicLong atomicLong = new AtomicLong();

    public void increment() {
        boolean incSuccessful = false;
        while(!incSuccessful) {
            long value = this.atomicLong.get();
            long newValue = value + 1;
            incSuccessful = this.atomicLong.compareAndSet(value, newValue);
        }
    }

    public long getCount() {
        return this.atomicLong.get();
    }

}
