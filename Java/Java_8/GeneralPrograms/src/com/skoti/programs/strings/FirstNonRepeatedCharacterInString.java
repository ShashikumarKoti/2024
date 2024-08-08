package com.skoti.programs.strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterInString {
    public static void main(String[] args) {
        String str = "pprogammoing";
        System.out.println(firstNonRepeatedCharacterUsingJava8(str));
        firstNonRepeatedCharacter(str);
    }

    private static String firstNonRepeatedCharacterUsingJava8(String str) {
        return Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting())).entrySet()
                .stream().filter(num -> num.getValue() == 1).findFirst().get().getKey();
    }

    private static void firstNonRepeatedCharacter(String str) {
        String[] split = str.split("");
        HashMap<String, Integer> linkedMap = new LinkedHashMap<>();
        for (String word : split) {
            if (linkedMap.containsKey(word)) {
                linkedMap.put(word, linkedMap.get(word) + 1);
            } else {
                linkedMap.put(word, 1);
            }
        }
        Set<Map.Entry<String, Integer>> entries = linkedMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }

}
