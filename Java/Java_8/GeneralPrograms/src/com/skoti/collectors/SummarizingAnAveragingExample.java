package com.skoti.collectors;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingAnAveragingExample {

    static List<Person> personList = Arrays.asList(
            new Person("Virat", 34, 50000.0),
            new Person("Dhoni", 42, 80000.0),
            new Person("Rohit", 35, 70000.0),
            new Person("Virat", 34, 50000.0)
    );

    public static void main(String[] args) {
        IntSummaryStatistics ageSummary = personList.stream().collect(Collectors.summarizingInt(Person::getAge));
        System.out.println(ageSummary);

        DoubleSummaryStatistics salarySummary = personList.stream().collect(Collectors.summarizingDouble(Person::getSalary));
        System.out.println(salarySummary);

        Double averagePersonAge = personList.stream().collect(Collectors.averagingInt(Person::getAge));
        System.out.println(averagePersonAge);

        Double averagePersonSalary = personList.stream().collect(Collectors.averagingDouble(Person::getSalary));
        System.out.println(averagePersonSalary);

    }
}
