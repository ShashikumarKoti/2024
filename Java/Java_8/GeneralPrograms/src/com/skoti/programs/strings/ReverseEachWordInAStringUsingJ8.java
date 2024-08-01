package com.skoti.programs.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInAStringUsingJ8 {

    public static void main(String[] args) {

        String reversedWord = reverseEachWord();
        System.out.println();
        System.out.println(reversedWord);
    }

    private static String reverseEachWord() {
        String word = "I am a Java Developer";
        //Approach 1
        Arrays.stream(word.split(" ")).map(a ->
                new StringBuilder(a).reverse().append(" ")).forEach(System.out::print);

        String word2 = "Java Concept of the day";
        //Approach 2
        return Arrays.stream(word2.split(" ")).map(str ->
                new StringBuilder(str).reverse().toString()).collect(Collectors.joining(" "));
    }
}
