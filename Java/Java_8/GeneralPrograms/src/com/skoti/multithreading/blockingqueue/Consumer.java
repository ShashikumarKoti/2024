package com.skoti.multithreading.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    BlockingQueue<String> blockingQueue;

    public Consumer(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String element = this.blockingQueue.take();
                System.out.println("consumed " + element);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
