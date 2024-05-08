package com.skoti.foreach;

import java.util.Arrays;
import java.util.List;

public class FilterListDemo {

  public static void main(String[] args) {
    List<String> friendsList =
        Arrays.asList("Shashi", "Ashfaq", "Rakesh", "Malli", "Rahul", "Jay", "Kotra");

    // legacy approach
    for (String friend : friendsList) {
      if (friend.startsWith("S")) {
        System.out.println(friend);
      }
    }

    System.out.println("========================================");
    // using streams
    friendsList.stream()
        .filter(friend -> friend.startsWith("M"))
        .forEach(friend -> System.out.println(friend));
  }
}
