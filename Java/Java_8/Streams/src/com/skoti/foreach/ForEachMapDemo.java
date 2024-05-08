package com.skoti.foreach;

import java.util.Map;

public class ForEachMapDemo {
  public static void main(String[] args) {

      //1st approach
    Map<Integer, String> integerStringMap = Map.of(1, "A", 2, "B", 3, "C", 4, "D");
    integerStringMap.forEach((key, value) -> System.out.println("Key is "+ key + " and value is "+ value));

    // 2nd approach
    integerStringMap.entrySet().stream().forEach(object -> System.out.println(object));
  }
}
