package com.skoti.collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MappingExample {

    static List<Person> personList = Arrays.asList(
            new Person("Virat", 34, 50000.0),
            new Person("Dhoni", 42, 80000.0),
            new Person("Rohit", 35, 70000.0),
            new Person("Virat", 34, 50000.0)
    );

    public static void main(String[] args) {

        List<String> personNamesLIst = personList.stream().map(emp -> emp.getName()).collect(Collectors.toList());
        System.out.println(personNamesLIst);

        List<String> personNamesList2 = personList.stream().collect(Collectors.mapping(Person::getName, Collectors.toList()));
        System.out.println(personNamesList2);

        Optional<Integer> maxAge = personList.stream().collect(Collectors.mapping(Person::getAge, Collectors.maxBy(Integer::compareTo)));
        System.out.println(maxAge.get());

        String collected = personList.stream().collect(Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparing(Person::getAge)), per -> per.isPresent() ? per.get().getName() : "None")
        );
        System.out.println(collected);


    }
}
