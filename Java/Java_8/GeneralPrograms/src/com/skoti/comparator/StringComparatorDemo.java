package com.skoti.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringComparatorDemo {

    public static void main(String[] args) {

        //To sort strings based on length. and if length is same then sort alphabetically
        List stringsList = Arrays.asList("shashi", "koti", "kumar", "somanath", "shweta", "hagedal", "aryan");

        Object collect = stringsList.stream().sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).collect(Collectors.toList());
        System.out.println(collect);
    }
}
