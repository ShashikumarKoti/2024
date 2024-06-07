package com.skoti.books.concepts.collections_utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseConcepts {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Z", "A", "K", "B");
        Collections.reverse(stringList);
        System.out.println(stringList);

        List<String> stringList2 = Arrays.asList("Z", "A", "K", "B");
        Collections.sort(stringList2, Collections.reverseOrder(new CustomComparator()));
        System.out.println(stringList2);

        List<String> stringList3 = Arrays.asList("Z", "A", "K", "B");
        Collections.sort(stringList3, Collections.reverseOrder());
        System.out.println(stringList3);

    }
}
