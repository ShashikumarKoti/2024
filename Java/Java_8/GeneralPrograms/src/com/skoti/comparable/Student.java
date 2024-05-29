package com.skoti.comparable;

public class Student implements Comparable<Student>{

    private String name;

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.getName());
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
