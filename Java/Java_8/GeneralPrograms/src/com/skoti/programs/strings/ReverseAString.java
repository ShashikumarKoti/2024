package com.skoti.programs.strings;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseAString {
    /*
    (reverse("bject")) + O => tcejbO
    ((reverse("ject")) + b) + O => tcejb
    (((reverse("ect")) + j) + b) + O => tcej
    ((((reverse("ct")) + e) + j) + b)+ O => tce
    (((((reverse("t")) + c) + e) + j) +b) + O => tc
    //return t
     */
    public static void main(String[] args) {

        reverseUsingJava8("Shashi kumar");
        reverseUsingJava8("Koti");
        reverseUsingSplit("Captain America");
        System.out.println();
        reverseUsingSplit("Hulk");
        System.out.println();
        String reversedString = reverseUsingRecursion("Optimus Prime");
        System.out.println(reversedString);
        String reversedString2 = reverseUsingRecursion("Winter");
        System.out.println(reversedString2);
    }

    private static String reverseUsingRecursion(String word) {
        if (Objects.isNull(word) || word.length() <= 1)
            return word;
        return reverseUsingRecursion(word.substring(1)) + word.charAt(0);
    }

    private static void reverseUsingSplit(String word) {
        String[] split = word.split("");
        for (int i = split.length - 1; i >= 0; i--) {
            System.out.print(split[i]);
        }
    }

    private static void reverseUsingJava8(String word) {
        String reversedString = Stream.of(word).map(str -> new StringBuilder(str).reverse().toString()).collect(Collectors.joining());
        System.out.println(reversedString);
    }

}

