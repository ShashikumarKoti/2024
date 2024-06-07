package com.skoti.books.concepts.map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapWithComparatorConcepts {

    public static void main(String[] args) {

        System.out.println("null values are allowed in TreeMap");
        var stringIntegerTreeMap = new TreeMap<>(new MyCustomStringComparator());
        stringIntegerTreeMap.put("hundred", 100);
        stringIntegerTreeMap.put("eighty eight", 88);
        stringIntegerTreeMap.put("seventy one", null);
        stringIntegerTreeMap.put("fifty four", 54);
        stringIntegerTreeMap.put("seventy one", 71);


        System.out.println("Custom sorting based on keys always");
        System.out.println(stringIntegerTreeMap);

        var integerStringTreeMap = new TreeMap<>(new MyCustomIntegerComparator());
        integerStringTreeMap.put(100, "hundred");
        integerStringTreeMap.put(88, "eighty eight");
        integerStringTreeMap.put(12, null);
        integerStringTreeMap.put(54, "fifty four");
        integerStringTreeMap.put(71, "seventy one");

        System.out.println("Custom sorting based on keys always");
        System.out.println(integerStringTreeMap);
    }
}

class MyCustomStringComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str2.compareTo(str1);
    }
}

class MyCustomIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer num1, Integer num2) {
        return num2.compareTo(num1);
    }
}