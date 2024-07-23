package com.skoti.programs.strings;

public class SwapTwoStringsWithoutUsingThirdVariable {

    public static void main(String[] args) {

        System.out.println("Before swapping");
        String string1 = "JAVA";
        String string2 = "SPRINGBOOT";
        System.out.println("string1: " + string1 + " string2: " + string2);

        string1 = string1 + string2;

        string2 = string1.substring(0, string1.length() - string2.length());
        string1 = string1.substring(string2.length());

        System.out.println("After swapping");
        System.out.println("string1: " + string1 + " string2: " + string2);
    }
}
