package java9.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        List<Integer> list
                = Stream.of(1,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        //This example returns an empty list because it fails at first list element, and takewhile stops here
        System.out.println(list);

        List<Integer> list2
                = Stream.of(2,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list2);
    }
}
