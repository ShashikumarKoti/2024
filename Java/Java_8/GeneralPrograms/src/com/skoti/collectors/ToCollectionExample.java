package com.skoti.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class ToCollectionExample {

    static List<Person> personList = Arrays.asList(
            new Person("Virat", 34, 50000.0),
            new Person("Dhoni", 42, 80000.0),
            new Person("Rohit", 35, 70000.0),
            new Person("Virat", 34, 50000.0)
    );

    public static void main(String[] args) {

        LinkedList<Person> personLinkedList = personList.stream().collect(Collectors.toCollection(LinkedList::new));
        System.out.println("No.of employees in employeeLinkedList: " + personLinkedList.size());
        System.out.println("Employees in employeeLinkedList: " + personLinkedList);

        HashSet<Person> personHashSet = personList.stream().collect(Collectors.toCollection(HashSet::new));
        System.out.println("No.of employees in personHashSet: " + personHashSet.size());
        System.out.println("Employees in personHashSet: " + personHashSet);

    }
}
