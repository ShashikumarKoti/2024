package com.skoti.books.concepts.collections_utils;

import java.util.Arrays;

public class ArraysSortSearchingConcepts {

    public static void main(String[] args) {

        int[] a = {10, 5, 3, 7, 9, 4};
        Arrays.sort(a);
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[] str = {"K", "Z", "C", "A", "T"};
        Arrays.sort(str);
        for (String sorted : str) {
            System.out.print(sorted + " ");
        }

        System.out.println();

        System.out.println(Arrays.binarySearch(str, "T"));
        System.out.println(Arrays.binarySearch(str, "O"));

        System.out.println();

        String[] str2 = {"K", "Z", "C", "A", "T"};
        Arrays.sort(str2, new CustomComparator());
        for (String sorted : str2) {
            System.out.print(sorted + " ");
        }

        System.out.println();

        System.out.println(Arrays.binarySearch(str2, "T", new CustomComparator()));
        System.out.println(Arrays.binarySearch(str2, "J", new CustomComparator()));
    }
}
