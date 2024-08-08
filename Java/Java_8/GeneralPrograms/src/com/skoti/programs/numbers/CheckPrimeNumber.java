package com.skoti.programs.numbers;

import java.util.stream.IntStream;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        int num = (int) (Math.random() * 20) + 2;
        boolean isPrime = IntStream.range(2, (num / 2) + 1).noneMatch(i -> num % i == 0);
        if (isPrime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}
