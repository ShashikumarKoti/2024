package com.skoti.programs.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInAString {

    public static void main(String[] args) {

        System.out.println(reverseEachWord());
        System.out.println(reverseEachWordUsingJ8());
    }

    private static String reverseEachWord() {
        String word = "Java Concept of the day";
        String[] splitString = word.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String s : splitString) {
            String[] eachWordArray = s.split("");
            for (int j = eachWordArray.length - 1; j >= 0; j--) {
                reversedString.append(eachWordArray[j]);
            }
            reversedString.append(" ");

        }
        return reversedString.toString();
    }

    private static String reverseEachWordUsingJ8() {
        String word = "I am a Java Developer";
        //Approach 1
        Arrays.stream(word.split(" ")).map(a ->
                new StringBuilder(a).reverse().append(" ")).forEach(System.out::print);

        System.out.println();
        String word2 = "Java Concept of the day";
        //Approach 2
        return Arrays.stream(word2.split(" ")).map(str ->
                new StringBuilder(str).reverse().toString()).collect(Collectors.joining(" "));
    }
}