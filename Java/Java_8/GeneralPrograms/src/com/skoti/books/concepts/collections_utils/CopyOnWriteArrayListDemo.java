package com.skoti.books.concepts.collections_utils;

import com.skoti.books.concepts.concurrent_collections.ConcurrentModificationExceptionDemo;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo extends Thread{

    static CopyOnWriteArrayList list = new CopyOnWriteArrayList();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Child thread updating list");
        list.add("C");
        list.add("D");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("We get ConcurrentModificationException while one thread is iterating a collection and other thread is trying to add/remove element to/from a collection");
        System.out.println("After iterator is created, element added to CopyOnWriteArrayList will not be visible due to immutable iterator");
        list.add("A");
        list.add("B");

        CopyOnWriteArrayListDemo concurrentModificationExceptionDemo = new CopyOnWriteArrayListDemo();
        concurrentModificationExceptionDemo.start();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String nextElement = (String) iterator.next();
            System.out.println("Main thread iterating list and current object is " + nextElement);
            Thread.sleep(3000);
        }
        System.out.println(list);

    }

}
