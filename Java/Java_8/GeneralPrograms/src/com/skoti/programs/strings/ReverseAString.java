package com.skoti.programs.strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAString {

    public static void main(String[] args) {

        doStringReverse("Spring boot");
        System.out.println();
        doStringReverseUsingJ8("Shashi kumar");
    }

    private static void doStringReverseUsingJ8(String word) {

        String reversedWord = Stream.of(word).map(str ->
                new StringBuilder(str).reverse().toString()).collect(Collectors.joining());
        System.out.println(reversedWord);

    }

    private static void doStringReverse(String word) {
        char[] wordCharArray = word.toCharArray();
        for (int i = wordCharArray.length - 1; i >= 0; i--) {
            System.out.print(wordCharArray[i]);
        }
    }
}
