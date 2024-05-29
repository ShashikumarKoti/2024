package com.skoti.comparable;

import java.util.Map;
import java.util.TreeMap;

public class StudentComparableDemo {

    public static void main(String[] args) {
        Map<Student, Integer> studentIntegerMap = Map.of(
                new Student("Bina"), 500,
                new Student("Akshay"), 200,
                new Student("Chintu"), 400
        );

        System.out.println("Before sorting: " + studentIntegerMap);
        TreeMap<Student, Integer> studentIntegerTreeMap = new TreeMap<>(studentIntegerMap);
        System.out.println("After sorting: " + studentIntegerTreeMap);
    }
}
