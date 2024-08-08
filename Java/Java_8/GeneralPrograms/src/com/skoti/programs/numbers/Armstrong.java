package com.skoti.programs.numbers;

public class Armstrong {

    public static void main(String[] args) {

        int number = 153;
        armStrongNumber(number);
        int initialValue = 0;
        int result = armStrongNumberUsingRecursion(number, initialValue);
        if (result == number) {
            System.out.println(number + " is a Armstrong number");
        }
    }

    private static int armStrongNumberUsingRecursion(int number, int result) {
        if (number == 0) {
            return result;
        }
        int remainder = number % 10;
        result = result + (remainder * remainder * remainder);
        return armStrongNumberUsingRecursion(number / 10, result);
    }

    private static void armStrongNumber(int number) {
        int originalNumber = number, result = 0;
        while (number > 0) {
            int remainder = number % 10;
            result = result + (remainder * remainder * remainder);
            number = number / 10;
        }
        if (result == originalNumber) {
            System.out.println(originalNumber + " is a Armstrong number");
        }
    }
}
