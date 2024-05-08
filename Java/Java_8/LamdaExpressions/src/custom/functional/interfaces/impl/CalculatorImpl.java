package custom.functional.interfaces.impl;

import custom.functional.interfaces.CalculatorWithArgsAndReturnType;
import custom.functional.interfaces.CalculatorWithArgsAndVoid;
import custom.functional.interfaces.CalculatorWithNoArgsAndVoid;

public class CalculatorImpl {

  public static void main(String[] args) {

    CalculatorWithNoArgsAndVoid calculatorWithNoArgsAndVoid =
        () -> System.out.println("Hello there!!!");
    calculatorWithNoArgsAndVoid.display();

    /*   CalculatorWithArgsAndVoid calculatorWithArgsAndVoid =
          (message) -> System.out.println("Hello " + message);
      calculatorWithArgsAndVoid.display("Mr.Shashi");
    */

    CalculatorWithArgsAndVoid calculatorWithArgsAndVoid =
        (number) -> System.out.println("Result is: " + (number * 5));
    calculatorWithArgsAndVoid.doSomeCalculation(15);

    CalculatorWithArgsAndReturnType calculatorWithArgsAndReturnType =
        (number1, number2) -> number1 + number2;
    System.out.println("Sum of numbers is " + calculatorWithArgsAndReturnType.sum(5, 6));

    CalculatorWithArgsAndReturnType calculatorWithArgsAndReturnType1 =
        (number1, number2) -> {
          if (number1 < number2) {
            throw new RuntimeException("Please check the numbers");
          } else {
            return number2 - number1;
          }
        };
    System.out.println(
        "Difference between numbers is " + calculatorWithArgsAndReturnType1.sum(6, 3));
  }
}
