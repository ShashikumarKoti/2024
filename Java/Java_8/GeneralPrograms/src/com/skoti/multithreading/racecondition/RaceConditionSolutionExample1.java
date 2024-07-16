package com.skoti.multithreading.racecondition;

public class RaceConditionSolutionExample1 {
    public static void main(String[] args) {

        CounterSynchronized counter = new CounterSynchronized();

        Thread thread1 = new Thread(getRunnable(counter, "Thread1 final count"));
        Thread thread2 = new Thread(getRunnable(counter, "Thread2 final count"));

        thread1.start();
        thread2.start();
    }

    private static Runnable getRunnable(CounterSynchronized counter, String message) {
        return () -> {
            for (int i = 0; i < 10000; i++) {
                counter.incAndGet();
            }
            System.out.println(message + " : " + counter.getCount());
        };
    }


}

class CounterSynchronized {

    private long count = 0;

    public void incAndGet() {
        synchronized (this) {
            this.count++;
        }
    }

    public long getCount() {
        synchronized (this) {
            return this.count;
        }
    }
}

