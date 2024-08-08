package com.skoti.programs.numbers;

import java.util.stream.IntStream;

public class FibonacciSeries {

    public static void main(String[] args) {
        IntStream.range(0, 10).forEach(num -> System.out.print(printFibonacciUsingRecursion(num) + " "));
        System.out.println();
        int range = 10;
        printFibonacci(range);
    }

    private static void printFibonacci(int range) {
        int num1 = 0, num2 = 1, num3;
        System.out.print(num1 + " " + num2);
        for (int i = 2; i < range; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

    private static int printFibonacciUsingRecursion(int number) {
        if (number == 0)
            return 0;
        if (number == 1 || number == 2)
            return 1;
        return printFibonacciUsingRecursion((number - 2)) + printFibonacciUsingRecursion((number - 1));
    }
}
