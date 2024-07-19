package com.skoti.multithreading.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample1 {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(3);
       // BlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue();

        arrayBlockingQueue.put("element 1");
        arrayBlockingQueue.put("element 2");

        String element1 = arrayBlockingQueue.take();
        String element2 = arrayBlockingQueue.take();

        System.out.println(element1);
        System.out.println(element2);
    }
}
