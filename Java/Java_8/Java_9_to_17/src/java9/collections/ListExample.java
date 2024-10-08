package java9.collections;

import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        //Empty list
        List<Object> immutableEmptyList = List.of();
        System.out.println(immutableEmptyList);
        //Below will throw exception as it is immutable list
        // immutableEmptyList.add("something is added");
        // System.out.println(immutableEmptyList);

        //Non-Empty list
        List<String> immutableNonEmptyList = List.of("one", "two", "three");
        System.out.println(immutableNonEmptyList);
        //Below will throw exception as it is immutable list
        //immutableNonEmptyList.add("four");
        //System.out.println(immutableNonEmptyList);
    }
}
