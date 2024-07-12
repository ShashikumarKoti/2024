package com.skoti.collectors;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectingAndThenExample {

    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(
                new Person("Virat", 34, 50000.0),
                new Person("Dhoni", 42, 80000.0),
                new Person("Rohit", 35, 70000.0)
        );

        Optional<Person> maxSalary = personList.stream().max(Comparator.comparing(Person::getSalary));
        System.out.println(maxSalary.get());

        String personName = personList.stream().collect(Collectors.collectingAndThen(
                Collectors.maxBy(Comparator.comparing(Person::getSalary)),
                person -> person.isPresent() ? person.get().getName() : "None"));
        System.out.println(personName);

        Double collect = personList.stream().collect(Collectors.averagingDouble(Person::getSalary));
        System.out.println(collect);

        String averageSalary = personList.stream().collect(Collectors.collectingAndThen(
                Collectors.averagingDouble(Person::getSalary),
                emp -> new DecimalFormat("'$'0.00").format(emp)));;
        System.out.println(averageSalary);


    }
}


class Person {

    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 17 + this.name.hashCode();
        hash = hash * 31 + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return this.age == person.age
                && this.name.equalsIgnoreCase(person.name);
    }
}