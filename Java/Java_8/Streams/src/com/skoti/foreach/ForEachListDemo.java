package com.skoti.foreach;

import java.util.Arrays;
import java.util.List;

public class ForEachListDemo {

  public static void main(String[] args) {

    List<String> friendsList =
        Arrays.asList("Shashi", "Ashfaq", "Rakesh", "Malli", "Rahul", "Jay", "Kotra");

    // Legacy approach
    for (String friend : friendsList) {
      System.out.println("Friend name using Legacy approach: " + friend);
    }

    System.out.println("========================================");
    // using streams
    friendsList.stream()
        .forEach(friend -> System.out.println("Friend name using streams approach: " + friend));
  }
}
