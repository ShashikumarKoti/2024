package com.skoti.sorting;

import com.skoti.foreach.employee.Employee;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMapOfCustomObject {

  public static void main(String[] args) {

    // legacy approach
    Map<Employee, Integer> employeeIntegerMap =
        new TreeMap<>(
            new Comparator<Employee>() {
              @Override
              public int compare(Employee employee1, Employee employee2) {
                return employee1.getSalary().compareTo(employee2.getSalary());
              }
            });
    employeeIntegerMap.put(new Employee(176, "Shashikumar", "Dev", 3000000.0), 60);
    employeeIntegerMap.put(new Employee(259, "Shwetha", "Test", 2000000.0), 90);
    employeeIntegerMap.put(new Employee(547, "Nitin", "Fresher", 500000.0), 50);
    employeeIntegerMap.put(new Employee(653, "Advith", "Fresher", 300000.0), 40);

    System.out.println(employeeIntegerMap);
    System.out.println("============================================");

    // legacy approach optimized1
    Map<Employee, Integer> employeeIntegerMap2 =
        new TreeMap<>((employee1, employee2) -> employee1.getDept().compareTo(employee2.getDept()));
    employeeIntegerMap2.put(new Employee(176, "Shashikumar", "Dev", 3000000.0), 60);
    employeeIntegerMap2.put(new Employee(259, "Shwetha", "Test", 2000000.0), 90);
    employeeIntegerMap2.put(new Employee(547, "Nitin", "Fresher", 500000.0), 50);
    employeeIntegerMap2.put(new Employee(653, "Advith", "Fresher", 300000.0), 40);

    System.out.println(employeeIntegerMap2);
    System.out.println("============================================");

    // legacy approach optimized2
    Map<Employee, Integer> employeeIntegerMap3 =
        new TreeMap<>(Comparator.comparing(Employee::getName));
    employeeIntegerMap3.put(new Employee(176, "Shashikumar", "Dev", 3000000.0), 60);
    employeeIntegerMap3.put(new Employee(259, "Shwetha", "Test", 2000000.0), 90);
    employeeIntegerMap3.put(new Employee(547, "Nitin", "Fresher", 500000.0), 50);
    employeeIntegerMap3.put(new Employee(653, "Advith", "Fresher", 300000.0), 40);

    System.out.println(employeeIntegerMap3);
    System.out.println("============================================");

    // using streams
    employeeIntegerMap.entrySet().stream()
        .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
        .forEach(System.out::println);
    System.out.println("============================================");

    employeeIntegerMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue())
        .forEach(System.out::println);

    System.out.println("============================================");
    employeeIntegerMap.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
        .forEach(System.out::println);

    System.out.println("============================================");
    // employee object as value in map
    Map<Integer, Employee> employeeMapObjectAsValue = new HashMap<>();
    employeeMapObjectAsValue.put(60, new Employee(176, "Shashikumar", "Dev", 3000000.0));
    employeeMapObjectAsValue.put(90, new Employee(259, "Shwetha", "Test", 2000000.0));
    employeeMapObjectAsValue.put(50, new Employee(547, "Nitin", "Fresher", 500000.0));
    employeeMapObjectAsValue.put(40, new Employee(653, "Advith", "Fresher", 300000.0));

    employeeMapObjectAsValue.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getDept)))
        .forEach(System.out::println);

    System.out.println("============================================");
    employeeMapObjectAsValue.entrySet().stream()
        .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getDept).reversed()))
        .forEach(System.out::println);
  }
}
