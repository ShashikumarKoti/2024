package com.skoti.skip_limit;

import java.util.Arrays;
import java.util.List;

public class SkipLimitDemo {

    public static void main(String[] args) {
        // Requirement : skip 1st element and read till 8 number in below list
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerList.stream().skip(1).limit(7).forEach(System.out::print);
        System.out.println();
        integerList.stream().skip(2).limit(7).forEach(System.out::print);
    }
}
