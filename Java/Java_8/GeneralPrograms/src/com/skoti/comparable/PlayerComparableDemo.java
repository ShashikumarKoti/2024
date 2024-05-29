package com.skoti.comparable;

import java.util.*;

public class PlayerComparableDemo {

    public static void main(String[] args) {

        List<Player> playerList = Arrays.asList(
                new Player(10, 55000.0, 40, "Sachin Tendulkar"),
                new Player(18, 60000.0, 35, "Virat Kohli"),
                new Player(7, 80000.0, 39, "MS Dhoni"),
                new Player(45, 70000.0, 39, "Rohit Sharma")
        );
        Collections.sort(playerList);
        playerList.forEach(System.out::println);
        System.out.println("=======================");
     //   Collections.reverse(playerList);
        playerList.sort(Comparator.reverseOrder());
        playerList.forEach(System.out::println);
        System.out.println("=======================");
        Collections.reverse(playerList);
        playerList.forEach(System.out::println);
        System.out.println("=======================");
        playerList.reversed();
        playerList.forEach(System.out::println);


        System.out.println("=======================");
        Set<Player> playerSet = new TreeSet<>();
        playerSet.add(new Player(18, 60000.0, 35, "Virat Kohli"));
        playerSet.add(new Player(10, 55000.0, 40, "Sachin Tendulkar"));


        System.out.println(playerSet);
    }
}
