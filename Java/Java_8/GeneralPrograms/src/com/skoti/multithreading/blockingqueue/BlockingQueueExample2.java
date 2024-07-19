package com.skoti.multithreading.blockingqueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample2 {

    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(10);
        arrayBlockingQueue.put("one");
        arrayBlockingQueue.put("two");
        arrayBlockingQueue.put("three");
        arrayBlockingQueue.put("four");
        arrayBlockingQueue.put("five");
        arrayBlockingQueue.put("six");
        arrayBlockingQueue.put("seven");

        Collection<String> destination1 = new ArrayList<>();
        Collection<String> destination2 = new ArrayList<>();

        arrayBlockingQueue.drainTo(destination1,3);
        arrayBlockingQueue.drainTo(destination2);

        System.out.println(destination1);
        System.out.println(destination2);

        BlockingQueue<String> arrayBlockingQueue2 = new ArrayBlockingQueue<>(10);
        String element = arrayBlockingQueue2.peek();
        System.out.println(element);

        try {
            String element1 = arrayBlockingQueue2.element();
            System.out.println(element1);
        }catch (NoSuchElementException e){
            System.out.println("queue is empty");
        }
    }
}
