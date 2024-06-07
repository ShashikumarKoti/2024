package com.skoti.books.concepts.map;

import java.util.TreeMap;

public class TreeMapNoArgsConstructorConcepts {

    public static void main(String[] args) {

        System.out.println("null values are allowed in TreeMap");
        var integerStringTreeMap = new TreeMap<>();
        integerStringTreeMap.put(100, "hundred");
        integerStringTreeMap.put(88, "eighty eight");
        integerStringTreeMap.put(12, null);
        integerStringTreeMap.put(54, "fifty four");
        integerStringTreeMap.put(71, "seventy one");

        System.out.println("Natural sorting based on keys always");
        System.out.println(integerStringTreeMap);

        var stringIntegerTreeMap = new TreeMap<>();
        stringIntegerTreeMap.put("hundred",100);
        stringIntegerTreeMap.put("eighty eight", 88);
        stringIntegerTreeMap.put("seventy one", null);
        stringIntegerTreeMap.put("fifty four", 54);
        stringIntegerTreeMap.put( "seventy one", 71);

        System.out.println("Natural sorting based on keys always");
        System.out.println(stringIntegerTreeMap);
    }
}
