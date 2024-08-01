package com.skoti.programs.strings;

public class ReverseEachWordInAString {

    public static void main(String[] args) {

        String reversedWord = reverseEachWord();
        System.out.println(reversedWord);
    }

    private static String reverseEachWord() {
        String word = "Java Concept of the day";
        String[] splitString = word.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (String s : splitString) {
            char[] eachWordArray = s.toCharArray();
            String reversedWord = "";
            for (int j = eachWordArray.length - 1; j >= 0; j--) {
                reversedString.append(eachWordArray[j]);
            }
            reversedString.append(reversedWord).append(" ");

        }
        return reversedString.toString();
    }
}