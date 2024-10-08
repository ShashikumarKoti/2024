package java9.streams;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        System.out.println("Take-while example");
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> i<= 5)
                .forEach(System.out::println);

        System.out.println("Drop-while example");
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .dropWhile(i -> i<= 5)
                .forEach(System.out::println);
    }
}
