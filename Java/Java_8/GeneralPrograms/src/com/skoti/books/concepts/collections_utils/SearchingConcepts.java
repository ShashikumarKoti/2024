package com.skoti.books.concepts.collections_utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingConcepts {

    public static void main(String[] args) {

        System.out.println("To use binarySearch() method, compulsory the list should be sorted");
        List<String> stringList = Arrays.asList("Z", "A", "K", "B");
        System.out.println("Binary search");
        Collections.sort(stringList);
        System.out.println(stringList);
        System.out.println(Collections.binarySearch(stringList, "K"));
        System.out.println(Collections.binarySearch(stringList, "F"));
        System.out.println(Collections.binarySearch(stringList, "T"));

        System.out.println("Custom sorting and then BinarySearch");
        Collections.sort(stringList, new CustomComparator());
        System.out.println(stringList);
        System.out.println(Collections.binarySearch(stringList, "K", new CustomComparator()));
        System.out.println(Collections.binarySearch(stringList, "G", new CustomComparator()));
    }
}

