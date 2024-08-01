package com.skoti.programs.strings;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {

        boolean isAnagram = checkAnagram("Mother In Law", "Hitler Woman");
        System.out.println(isAnagram);
    }

    private static boolean checkAnagram(String word1, String word2) {

        String str1 = word1.replaceAll("\\s", "");
        String str2 = word2.replaceAll("\\s", "");

        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        if (charArray1.length != charArray2.length)
            return false;

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        System.out.println(charArray1);
        System.out.println(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
