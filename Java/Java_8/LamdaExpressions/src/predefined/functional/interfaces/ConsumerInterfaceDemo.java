package predefined.functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

  public static void main(String[] args) {
    Consumer consumer = integer -> System.out.println("Printing integer: " + integer);
    consumer.accept(10);
    System.out.println("==========================");



    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
    // forEach accepts consumer as input
    integerList.stream().forEach(consumer);
    System.out.println("==========================");
    // further refactoring above line
    List<Integer> integerList2 = Arrays.asList(6, 7, 8, 9, 10);
    integerList2.stream().forEach(integer1 -> System.out.println("Printing integers: " + integer1));
  }
}
