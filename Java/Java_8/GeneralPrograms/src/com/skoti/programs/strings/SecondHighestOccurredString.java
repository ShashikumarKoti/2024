package com.skoti.programs.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestOccurredString {

    public static void main(String[] args) {
        String str = "this is small this ok small this";

        //Approach 1 - for 2nd highest occurrence
        Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).
                skip(1).findFirst().ifPresent(System.out::println);

        //Approach 2 - for 1st highest occurrence
        Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).
                entrySet().stream().max(Map.Entry.comparingByValue()).
                ifPresent(System.out::println);
    }
}
