package com.skoti.books.concepts.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetNoArgsConstructorConcepts {

    public static void main(String[] args) {

        System.out.println("TreeSet - null NOT allowed | insertion order not preserved | Implements Serializable, Cloneable | heterogeneous objects not allowed ");
        System.out.println("For natural sorting, all objects must be homogeneous and comparable");

        Set integerTreeSet = new TreeSet();
        integerTreeSet.add(5);
        integerTreeSet.add(3);
        integerTreeSet.add(7);

        System.out.println(integerTreeSet);

        Set stringTreeSet = new TreeSet();
        stringTreeSet.add("five");
        stringTreeSet.add("three");
        stringTreeSet.add("seven");

        System.out.println(stringTreeSet);

        Set mixedObjectsTreeSet = new TreeSet();
//        mixedObjectsTreeSet.add(5);
//        mixedObjectsTreeSet.add("three");
//        mixedObjectsTreeSet.add(7);
//
//        System.out.println(mixedObjectsTreeSet);


        Set objectsShouldBeComparable = new TreeSet();
        System.out.println("Since employee obj is not implementing Comparable, we wil get ClassCastException");
        objectsShouldBeComparable.add(new Employee("Shashi", "Kumar"));
        objectsShouldBeComparable.add(new Employee("Ved", "Aryan"));

        System.out.println(objectsShouldBeComparable);


    }
}


class Employee{

    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}