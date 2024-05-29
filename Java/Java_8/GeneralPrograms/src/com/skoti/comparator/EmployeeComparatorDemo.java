package com.skoti.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparatorDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Virat", 34, 50000.0, 991666977),
                new Employee("Rohit", 34, 60000.0, 991666966),
                new Employee("Dhoni", 42, 40000.0, 991666955)
        );

        List<Employee> employeeListWithNull = Arrays.asList(
                new Employee("Virat", 34, 50000.0, 991666977),
                new Employee("Rohit", 34, 60000.0, 991666966),
                null,
                new Employee("Dhoni", 42, 40000.0, 991666955)
        );

        List<Employee> employeeListWithNullNames = Arrays.asList(
                new Employee("Virat", 34, 50000.0, 991666977),
                new Employee(null, 34, 60000.0, 991666966),
                new Employee("Dhoni", 42, 40000.0, 991666955)
        );


        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getName);
        Collections.sort(employeeList, employeeComparator);
        employeeList.forEach(System.out::println);
        System.out.println("===========================================");
        Collections.sort(employeeList, Comparator.comparing(Employee::getSalary).reversed());
        employeeList.forEach(System.out::println);
        System.out.println("===========================================");
        Collections.sort(employeeList,Comparator.comparing(Employee::getAge).thenComparing(Employee::getSalary));
        employeeList.forEach(System.out::println);
        System.out.println("===========================================");
        employeeList.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getMobile)).forEach(System.out::println);

        System.out.println("===========================================");
        employeeListWithNull.stream().sorted(Comparator.nullsFirst(Comparator.comparing(Employee::getName))).forEach(System.out::println);

        System.out.println("===========================================");
        employeeListWithNull.stream().sorted(Comparator.nullsLast(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);

        System.out.println("===========================================");
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).map(Employee::getName).forEach(System.out::println);


        System.out.println("===========================================");
        employeeListWithNullNames.stream().sorted(Comparator.comparing(Employee::getName, Comparator.nullsFirst(String::compareTo))).forEach(System.out::println);

        System.out.println("===========================================");
        employeeListWithNullNames.stream().sorted(Comparator.comparing(Employee::getName, Comparator.nullsLast(String::compareTo))).forEach(System.out::println);

    }
}
