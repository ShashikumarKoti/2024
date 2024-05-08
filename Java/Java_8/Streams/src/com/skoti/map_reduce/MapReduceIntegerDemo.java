package com.skoti.map_reduce;

import java.util.Arrays;
import java.util.Optional;

public class MapReduceIntegerDemo {

  // reduce is used to combine elements of a stream and produce single value

  public static void main(String[] args) {

    Integer sumOfNumbersUsingReduce =
        Arrays.asList(1, 2, 3, 4).stream().reduce(0, (num1, num2) -> num1 + num2);
    System.out.println("sumOfNumbersUsingReduce " + sumOfNumbersUsingReduce);

    Integer multiplicationOfNumbersUsingReduce =
        Arrays.asList(1, 2, 3, 4).stream().reduce(1, (num1, num2) -> num1 * num2);
    System.out.println("multiplicationOfNumbersUsingReduce " + multiplicationOfNumbersUsingReduce);

    Optional<Integer> max = Arrays.asList(5, 1, 9, 3, 4).stream().reduce(Integer::max);
    System.out.println("max " + max.get());

    Integer max2 =
        Arrays.asList(5, 1, 9, 3, 4).stream().reduce(0, (num1, num2) -> num1 > num2 ? num1 : num2);
    System.out.println("max2 " + max2);

    Optional<Integer> min = Arrays.asList(5, 1, 9, 3, 4, -2).stream().reduce(Integer::min);
    System.out.println("min " + min.get());

    int min2 =
        Arrays.asList(5, 1, 9, 3, 4, -2).stream()
            .reduce(0, (num1, num2) -> num1 < num2 ? num1 : num2);
    System.out.println("min2 " + min2);

    Optional<Integer> sum = Arrays.asList(5, 1, 9, 3, 4, -2).stream().reduce(Integer::sum);
    System.out.println("sum " + sum.get());

    int sum2 = Arrays.asList(5, 1, 9, 3, 4, -2).stream().mapToInt(num -> num).sum();
    System.out.println("sum2 " + sum2);
  }
}
