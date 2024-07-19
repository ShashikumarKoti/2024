package com.skoti.multithreading.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    BlockingQueue<String> blockingQueue;

    public Producer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            long timeMillis = System.currentTimeMillis();
            try {
                this.blockingQueue.put("" + timeMillis);
                System.out.println(Thread.currentThread().getName() + " produced " + timeMillis);
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
            sleep(1000);
        }
    }

    private void sleep(long timeMillis) {
        try {
            Thread.sleep(timeMillis);
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
        }
    }
}
