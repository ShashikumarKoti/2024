package java9.collections;

import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        //Empty map
        Map<Object, Object> immutableEmptyMap = Map.of();
        System.out.println(immutableEmptyMap);
        //Below will throw exception as it is immutable Map
        //immutableEmptyMap.put(1, "one");
        //System.out.println(immutableEmptyMap);

        //Non-empty map
        Map<Integer, String> immutableNonEmptyMap = Map.of(1, "one", 2, "two", 3, "three");
        System.out.println(immutableNonEmptyMap);
        //Below will throw exception as it is immutable Map
        // immutableNonEmptyMap.put(4, "four");
        // System.out.println(immutableNonEmptyMap);

    }
}
