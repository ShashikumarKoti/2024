package com.skoti.comparable;

import java.util.*;

public class PlayerComparableDemoUsingMap {

    public static void main(String[] args) {

        Map<Player, Integer> playerIntegerMap = Map.of(
                new Player(10, 55000.0, 40, "Sachin Tendulkar"), 900,
                new Player(18, 60000.0, 35, "Virat Kohli"), 700,
                new Player(7, 80000.0, 39, "MS Dhoni"), 400,
                new Player(45, 70000.0, 39, "Rohit Sharma"), 100
        );

        List<Map.Entry<Player, Integer>> playerEntries = new ArrayList<>(playerIntegerMap.entrySet());

        Collections.sort(playerEntries, Map.Entry.comparingByKey());
        for (Map.Entry<Player, Integer> player : playerEntries) {
            System.out.println("Player key:" + player.getKey() + " and value: "+ player.getValue());
        }
        System.out.println("====================");
        Collections.sort(playerEntries, Map.Entry.comparingByValue());
        for (Map.Entry<Player, Integer> player : playerEntries) {
            System.out.println("Player key:" + player.getKey() + " and value: "+ player.getValue());
        }

        System.out.println("====================");
        TreeMap<Player, Integer> treeMap = new TreeMap(playerIntegerMap);
        for (Map.Entry<Player, Integer> playerIntegerEntry : treeMap.entrySet()) {
            System.out.println("PLayer key: "+ playerIntegerEntry.getKey() + " value "+ playerIntegerEntry.getValue());
        }
    }
}
