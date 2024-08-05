package com.skoti.programs.numbers;

import java.util.*;

public class SecondHighestNumberInArray {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(-3, 51, 75, 28, 41, -67, 99, 42);
        numList.stream().distinct().
                sorted(Comparator.reverseOrder()).skip(1).
                findFirst().ifPresent(System.out::println);
    }
}
