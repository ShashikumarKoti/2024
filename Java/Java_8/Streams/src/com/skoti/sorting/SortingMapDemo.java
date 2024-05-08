package com.skoti.sorting;

import java.util.*;

public class SortingMapDemo {

  public static void main(String[] args) {

    Map<Integer, String> integerStringMap = Map.of(1, "ONE", 2, "TWO", 3, "THREE", 4, "FOUR");

    //legacy approach
    List<Map.Entry<Integer, String>> entries = new ArrayList<>(integerStringMap.entrySet());
    // approach 1
    Collections.sort(entries, (map1, map2) -> map1.getValue().compareTo(map2.getValue()));

    // approach2
    Collections.sort(entries, Comparator.comparing(Map.Entry::getKey));

    // approach3
    Collections.sort(entries, Map.Entry.comparingByValue(Comparator.reverseOrder()));

    for (Map.Entry<Integer, String> entry : entries) {
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }
    System.out.println("============================================");

    // using streams
    integerStringMap.entrySet().stream()
        .sorted(Map.Entry.comparingByKey())
        .forEach(System.out::println);

    System.out.println("============================================");
    integerStringMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(System.out::println);
  }
}
