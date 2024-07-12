package com.skoti.multithreading.synchronizedlearning;

public class SyncCounterMain {

    public static void main(String[] args) {
        SyncCounter syncCounter = new SyncCounter();

        Thread thread1 = new Thread(
                () -> {
                    for (int i=0;i<10000;i++){
                        syncCounter.incCount();
                    }
                    System.out.println(Thread.currentThread().getName() + "::" + syncCounter.getCount());
                }
        );
        Thread thread2 = new Thread(
                () -> {
                    for (int i=0;i<10000;i++){
                        syncCounter.incCount();
                    }
                    System.out.println(Thread.currentThread().getName() + "::" + syncCounter.getCount());
                }
        );

        thread1.start();
        thread2.start();
    }
}


class SyncCounter {

    private long count = 0;

    public void incCount() {
        synchronized (this){
            this.count++;
        }
    }

    public long getCount() {
        synchronized (this){
            return this.count;
        }
    }
}
