package com.skoti.comparator;

import java.util.*;
import java.util.stream.Collectors;

public class ComparatorMapDemo1 {

    public static void main(String[] args) {

        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(3, "three");
        testMap.put(7, "seven");
        testMap.put(8, "eight");
        testMap.put(4, "four");

        Map<Integer, String> sortedMap = new TreeMap<>(testMap);
        System.out.println(sortedMap);
        System.out.println("===================");

        Map<Integer, String> testMapReverse = new HashMap<>();
        testMapReverse.put(3, "three");
        testMapReverse.put(7, "seven");
        testMapReverse.put(8, "eight");
        testMapReverse.put(4, "four");

        Map<Integer, String> sortedMapReverse = new TreeMap<>(Comparator.reverseOrder());
        sortedMapReverse.putAll(testMapReverse);
        System.out.println(sortedMapReverse);
        System.out.println("===================");


        testMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("===================");
        LinkedHashMap<Integer, String> integerStringLinkedHashMap = testMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(integerStringLinkedHashMap);

        System.out.println("===================");
        LinkedHashMap<Integer, String> integerStringLinkedHashMapReverseOrder = testMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(integerStringLinkedHashMapReverseOrder);
    }
}
