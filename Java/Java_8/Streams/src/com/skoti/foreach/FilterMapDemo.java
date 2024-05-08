package com.skoti.foreach;

import java.util.Map;

public class FilterMapDemo {
  public static void main(String[] args) {

    Map<Integer, String> integerStringMap = Map.of(1, "A", 2, "B", 3, "C", 4, "D");
    integerStringMap.entrySet().stream()
        .filter(key -> key.getKey() % 2 == 0)
        .forEach(key -> System.out.println(key));

    integerStringMap.entrySet().stream()
        .filter(value -> value.getValue().startsWith("B"))
        .forEach(value -> System.out.println(value));
  }
}
