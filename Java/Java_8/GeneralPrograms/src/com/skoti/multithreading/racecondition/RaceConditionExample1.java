package com.skoti.multithreading.racecondition;

public class RaceConditionExample1 {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread1 = new Thread(getRunnable(counter, "Thread1 final count"));
        Thread thread2 = new Thread(getRunnable(counter, "Thread1 final count"));

        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(Counter counter, String message) {
        return () -> {
            for (int i = 0; i < 10000; i++) {
                counter.incAndGet();
            }
            System.out.println(message + " : " + counter.getCount());
        };
    }


}

class Counter {

    private long count = 0;

    public void incAndGet() {
        this.count++;
    }

    public long getCount() {
        return this.count;
    }
}
