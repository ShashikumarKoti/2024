package com.skoti.programs.numbers;

public class ReverseNumber {

    public static void main(String[] args) {

        int number1 = 123;
        int number2 = 456;
        System.out.println(reverseNumber(number1));
        reverserNumberUsingRecursion(number2);
    }

    private static void reverserNumberUsingRecursion(int number) {
        if (number < 10) {
            System.out.print(number);
        }else {
            System.out.print(number%10);
            reverserNumberUsingRecursion(number/10);
        }
    }

    private static int reverseNumber(int number) {
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum = remainder + (sum * 10);
            number = number / 10;

        }
        return sum;
    }
}
/*
1st iteration
input = 123
sum = 0
remainder =  input % 10 = 3
sum = remainder + (sum *10) = 3 + 0 = 3
number = num /10 = 12

2nd iteration
input = 12
sum = 3
remainder = input % 10 = 2
sum = remainder + (sum *10) = 2 + (3*10) = 32
number = num /10 = 1

3rd iteration
input = 1
sum = 32
remainder = input % 10 = 1
sum = remainder + (sum *10) = 1 + (32*10) = 321
number = num /10 = 0
 */