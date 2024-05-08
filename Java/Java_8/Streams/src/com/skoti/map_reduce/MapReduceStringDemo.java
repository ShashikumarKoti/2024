package com.skoti.map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceStringDemo {
  public static void main(String[] args) {

    List<String> stringList = Arrays.asList("core_java", "springBoot", "devops", "microservices");

    String stringWithMoreCharacters =
        stringList.stream()
            .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
            .get();
    System.out.println(stringWithMoreCharacters);

  }
}
