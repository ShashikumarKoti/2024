package com.skoti.programs.numbers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberSeries {

    public static void main(String[] args) {

        int number = 20;
        List<Integer> primeNumbersList = IntStream.rangeClosed(2, number).
                filter(PrimeNumberSeries::primeNumberSeriesUsingJava8).boxed().collect(Collectors.toList());
        System.out.println(primeNumbersList);
        checkPrime(19);
        primeNumberSeries(20);
        System.out.println();
        boolean isPrime = primeNumbersUsingRecursion(19, 2);
        System.out.println(isPrime);
    }

    private static boolean primeNumbersUsingRecursion(int num, int i) {
            if(num <=2)
                return (num==2) ? true : false;
            if (num % i==0)
                return false;
            if (i*i > num)
                return true;
            return primeNumbersUsingRecursion(num, i+1);


    }

    private static void primeNumberSeries(int series) {
        for (int i=2;i<=series;i++) {
            int temp = 0;
            for (int j=2;j<i;j++) {
                if (i%j==0) {
                    temp =1;
                    break;
                }
            }
            if (temp == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void checkPrime(int num) {
        int temp = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Given num " + num + " is not prime");
                temp = 1;
                break;
            }
        }
        if (temp == 0) {
            System.out.println("Given num " + num + " is a prime");
        }
    }

    public static boolean primeNumberSeriesUsingJava8(int number) {
        //  return IntStream.rangeClosed(2, (number/2)+1).allMatch( num -> number%2 !=0);
        return IntStream.rangeClosed(2, (int) Math.sqrt(number)).allMatch(i -> number % i != 0);

    }
}
