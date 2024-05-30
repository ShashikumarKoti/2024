package com.skoti.collectors;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RangeRangeClosedExample {

    public static void main(String[] args) {

        IntStream.range(1,10).forEach(number -> System.out.print(number + " "));
        System.out.println();
        IntStream.rangeClosed(1,10).forEach(number -> System.out.print(number + " "));
        System.out.println();

        LongStream.range(10000L, 10005L).forEach(number -> System.out.print(number + " "));
        System.out.println();
        LongStream.rangeClosed(10000L, 10005L).forEach(number -> System.out.print(number + " "));

    }
}
