package com.skoti.books.concepts.collections_utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingConcepts {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Z", "A", "K", "B");
        System.out.println("Natural sorting");
        Collections.sort(stringList);
        System.out.println(stringList);

        System.out.println("Custom sorting");
        Collections.sort(stringList, new CustomComparator());
        System.out.println(stringList);

    }
}

class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str2.compareTo(str1);
    }
}