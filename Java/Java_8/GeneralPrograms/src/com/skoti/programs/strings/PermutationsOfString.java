package com.skoti.programs.strings;

public class PermutationsOfString {

    public static void main(String[] args) {

        String word = "ABCD";
        findAllPermutations("", word);
    }

    private static void findAllPermutations(String permutation, String input) {
        if (input.isEmpty()){
            System.out.println(permutation);
        } else {
            for (int i=0 ; i< input.length(); i++) {
                findAllPermutations(permutation + input.charAt(i),
                        input.substring(0,i)+input.substring(i+1, input.length()));
            }
        }
    }
}
