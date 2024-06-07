package com.skoti.books.concepts.concurrent_collections;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {

    static ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Child thread updating map");
        concurrentHashMap.put("C", 50);
    }

    public static void main(String[] args) throws InterruptedException {

        concurrentHashMap.put("zeeshan", 500);
        concurrentHashMap.put("nagarjun", 100);
        concurrentHashMap.put("ballaiah", 700);
        concurrentHashMap.put("chiru", 400);
        concurrentHashMap.put("ballaiah", 900);

        ConcurrentHashMapDemo concurrentHashMapDemo = new ConcurrentHashMapDemo();
        concurrentHashMapDemo.start();
        Set keySet = concurrentHashMap.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String next = (String) iterator.next();
            System.out.println("Main thread iterating map and key is " + next);
            Thread.sleep(3000);
        }
        System.out.println(concurrentHashMap);


    }
}
