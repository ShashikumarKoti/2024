package com.skoti.programs.strings;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MultipleDelimiters {

    public static void main(String[] args) {
        String str = "Spanish... spanish the green spanish. I! am the spanish, java shashi!!!shashi";
        String updatedString = str.replaceAll("[^A-Za-z]+", " ");
        System.out.println(updatedString);

        Map<String, Long> map = Arrays.stream(updatedString.split(" ")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(word -> word.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map);
    }
}
