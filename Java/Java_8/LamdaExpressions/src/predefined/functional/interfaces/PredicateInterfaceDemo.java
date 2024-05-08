package predefined.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {

  public static void main(String[] args) {
    Predicate<Integer> predicate =
        number -> {
          if (number % 2 == 0) {
            return true;
          } else {
            return false;
          }
        };
    System.out.println(predicate.test(4));

    // refactoring above code
    Predicate<Integer> predicate2 = number -> number % 2 == 0;
    System.out.println(predicate2.test(5));

    //filter in streams uses predicate as input
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    integerList.stream().filter(predicate2).forEach( number -> System.out.println("Even number " + number));

    List<Integer> integerList2 = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
    integerList2.stream().filter(number -> number % 2 == 0).forEach( number -> System.out.println("Even numbers " + number));

    List<Integer> integerList3 = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
    integerList3.stream().filter(number -> number % 2 == 0).forEach(System.out::println);
  }
}
