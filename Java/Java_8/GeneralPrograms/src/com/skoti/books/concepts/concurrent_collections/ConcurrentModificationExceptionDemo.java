package com.skoti.books.concepts.concurrent_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionDemo extends Thread {


    static List list = new ArrayList();

    @Override
    public void run() {
        list.add("added by second thread");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("We get ConcurrentModificationException while one thread is iterating a collection and other thread is trying to add/remove element to/from a collection");
        list.add("A");
        list.add("B");
        list.add("C");

        ConcurrentModificationExceptionDemo concurrentModificationExceptionDemo = new ConcurrentModificationExceptionDemo();
        concurrentModificationExceptionDemo.start();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String nextElement = (String) iterator.next();
            System.out.println("Main thread iterating list and current object is " + nextElement);
            Thread.sleep(3000);
            list.add("added by main thread");
        }
        System.out.println(list);

    }
}
