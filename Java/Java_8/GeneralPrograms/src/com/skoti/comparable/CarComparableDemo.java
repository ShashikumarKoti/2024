package com.skoti.comparable;

import java.util.*;

public class CarComparableDemo {

    public static void main(String[] args) {

        LinkedHashMap<String, Cart> obj = new LinkedHashMap<>();
        Cart obj1 = new Cart("Rice", 59);
        Cart obj2 = new Cart("Milk", 60);
        Cart obj3 = new Cart("Bread", 45);

        obj.put(obj1.getItem(), obj1);
        obj.put(obj2.getItem(), obj2);
        obj.put(obj3.getItem(), obj3);


        List<Cart> cartList = new ArrayList<>(obj.values());
        Collections.sort(cartList);
        System.out.println("Elements of the newly sorted map: ");
        System.out.println(cartList);


        LinkedHashMap<String, Integer> workers = new LinkedHashMap<>();
        workers.put("Vaibhav", 4000);
        workers.put("Ansh", 3000);
        workers.put("Vivek", 1500);
        workers.put("Aman", 2000);
        workers.put("Tapas", 2500);

        //Approach 1
//        TreeMap<String, Integer> stringIntegerTreeMap = new TreeMap<>(workers);
//        for (String workerKey : stringIntegerTreeMap.keySet()) {
//            System.out.println("Sorting by keys: " + workerKey);
//        }

        //approach 2
        List<Map.Entry<String,Integer>> workersList = new ArrayList<>(workers.entrySet());
        List<Map.Entry<String, Cart>> cartEntries = new ArrayList<>(obj.entrySet());

        Collections.sort(cartEntries, Map.Entry.comparingByValue());
        for (Map.Entry<String,Cart> cartEntry : cartEntries) {
            System.out.println("Cart entries Sorting by values: " + "Key:" + cartEntry.getKey() + " value: " + cartEntry.getValue());
        }
        System.out.println("==========================");
        Collections.sort(cartEntries, Map.Entry.comparingByKey());
        for (Map.Entry<String,Cart> cartEntry : cartEntries) {
            System.out.println("Cart entries Sorting by keys: " + "Key:" + cartEntry.getKey() + " value: " + cartEntry.getValue());
        }
        System.out.println("==========================");
        //sort by keys
        Collections.sort(workersList, Map.Entry.comparingByKey());
        for (Map.Entry<String,Integer> workerValue : workersList) {
            System.out.println("Sorting by keys: " + "Key:" + workerValue.getKey() + " value: " + workerValue.getValue());
        }
        System.out.println("==========================");
        Collections.sort(workersList,
                Map.Entry.comparingByValue());
        for (Map.Entry<String,Integer> workerValue : workersList) {
            System.out.println("Sorting by values: " + "Key:" + workerValue.getKey() + " value: " + workerValue.getValue());
        }

    }
}
