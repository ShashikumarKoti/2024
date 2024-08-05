package com.skoti.programs.numbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberSeries {

    public static void main(String[] args) {

        int number = 20;
        List<Integer> primeNumbersList = IntStream.rangeClosed(2, number).
                filter(PrimeNumberSeries::isPrime).boxed().collect(Collectors.toList());
        System.out.println(primeNumbersList);
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(number)).allMatch(i-> number % i != 0);
    }
}
