package java9.streams;

import java.util.stream.Stream;

public class StreamExample4 {

    public static void main(String[] args) {

        Stream.iterate(1, i -> i <= 10, i -> i*3)
                .forEach(System.out::println);
    }
}
