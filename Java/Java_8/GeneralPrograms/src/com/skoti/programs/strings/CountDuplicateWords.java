package com.skoti.programs.strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateWords {

    public static void main(String[] args) {

        findDuplicates("Super Man and Bat man And Spider Man");
    }

    private static void findDuplicates(String s) {
        List<String> stringList = Arrays.stream(s.toLowerCase().split(" ")).toList();
        //Approach 1
        Set<String> tempSet = new HashSet<>();
        Set<String> repeatedWords = stringList.stream().filter(word -> !tempSet.add(word)).collect(Collectors.toSet());
        System.out.println(repeatedWords);

        //Approach 2
        Map<String, Long> collect = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        Map<String, Long> map = collect.entrySet().stream().filter(word -> word.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map);
    }
}
