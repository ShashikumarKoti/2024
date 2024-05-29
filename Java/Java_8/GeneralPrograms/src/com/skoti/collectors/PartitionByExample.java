package com.skoti.collectors;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByExample {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45),
                new Employee("Harry Major", 25),
                new Employee("Ethan Hardy", 65),
                new Employee("Nancy Smith", 22),
                new Employee("Deborah Sprightly", 29));

        Map<Boolean, List<Employee>> booleanListMap = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() > 35));
        System.out.println("Employees partitioned based on age");
        booleanListMap.forEach(
                (Boolean key, List<Employee> employeesList) -> System.out.println(key + " : " + employeesList)
        );

        System.out.println("=========================================");
        LinkedHashMap<Boolean, List<Employee>> booleanListLinkedHashMap = booleanListMap.entrySet().stream().filter(map -> map.getKey().equals(true)).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(booleanListLinkedHashMap);
    }
}
