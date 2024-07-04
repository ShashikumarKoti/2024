package com.skoti.designpatterns.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Student student = new Student.StudentBuilder()
                .firstName("Koti")
                .rollNum(111)
                .age(35)
                .build();

        System.out.println(student);
    }
}
