package com.skoti.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

  public static void main(String[] args) {
    List<String> friendsList =
        Arrays.asList("Shashi", "Ashfaq", "Rakesh", "Malli", "Rahul", "Jay", "Kotra");

    // legacy approach
    Collections.sort(friendsList); // ascending
    System.out.println(friendsList);

    System.out.println("============================================");
    Collections.reverse(friendsList); // descending
    System.out.println(friendsList);
    System.out.println("============================================");

    // using streams
    friendsList.stream()
        .sorted()
        .forEach(friend -> System.out.println("Ascending Sorting using streams: " + friend));
    System.out.println("============================================");

    friendsList.stream()
        .sorted(Comparator.reverseOrder())
        .forEach(friend -> System.out.println("Descending Sorting using streams: " + friend));
  }
}
