package com.skoti.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningExample {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        String joinedStr = integerList.stream().map(integer -> integer.toString()).collect(Collectors.joining());
        System.out.println("Joined String: "+joinedStr);

        String joinedStr2 = integerList.stream().map(integer -> integer.toString()).collect(Collectors.joining(","));
        System.out.println("Joined String2: "+joinedStr2);

        String joinedStr3 = integerList.stream().map(integer -> integer.toString()).collect(Collectors.joining(",", "[", "]"));
        System.out.println("Joined String2: "+joinedStr3);
    }
}
