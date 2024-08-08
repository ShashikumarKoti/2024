package com.skoti.programs.numbers;


public class FactorialNumber {

    public static void main(String[] args) {

        int number = 5;
        System.out.println(factorialUsingRecursion(number));
        factorialUsingLoop(number);
    }

    private static void factorialUsingLoop(int number) {
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result = result * i;
        }
        System.out.println(result);
    }

    private static int factorialUsingRecursion(int number) {
        if (number == 0 || number == 1)
            return 1;
        return number * factorialUsingRecursion(number - 1);
    }
}
