package com.skoti.books.concepts.map;

import javax.swing.*;
import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapConcepts {

    public static void main(String[] args) throws InterruptedException {

        var normalHashMap = new HashMap<>();
        Test test = new Test();
        normalHashMap.put(test, " Wow");
        System.out.println(normalHashMap);
        test = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(normalHashMap);

        System.out.println("Executing WeakHashMap");
        var weakHashMap = new WeakHashMap<>();
        Test test2 = new Test();
        weakHashMap.put(test2, " Wow");
        System.out.println(weakHashMap);
        test2 = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(weakHashMap);
    }
}


class Test {

    public String toString() {
        return "Hello I am still there!!!!";
    }

    public void finalize() {
        System.out.println("Finalize method called in case of WeakHashMap");
    }
}