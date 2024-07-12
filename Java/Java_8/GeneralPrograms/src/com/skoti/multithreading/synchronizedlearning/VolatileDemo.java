package com.skoti.multithreading.synchronizedlearning;

public class VolatileDemo {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        Thread thread1 = new Thread(
                counter::inc
        );
        Thread thread2 = new Thread(
                counter::inc
        );
        thread1.start();
        thread2.start();
        Thread.sleep(2000);
        System.out.println(counter.getCount());
    }
}

class Counter {

    private volatile int count =0;

    public void inc() {
        while(this.count != 10) {
            this.count++;
            System.out.println(this.count);
        }

    }

    public int getCount() {
        return this.count;
    }
}