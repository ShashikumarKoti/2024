package com.skoti.designpatterns.builder;


public class Student {

    private final String firstName;
    private final String lastName;
    private final int rollNum;
    private final int age;
    private final String school;

    private Student(StudentBuilder studentBuilder) {
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.rollNum = studentBuilder.rollNum;
        this.age = studentBuilder.age;
        this.school = studentBuilder.school;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRollNum() {
        return rollNum;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }


    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private int rollNum;
        private int age;
        private String school;

        public StudentBuilder() {
        }

        public StudentBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentBuilder rollNum(int rollNum) {
            this.rollNum = rollNum;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder school(String school) {
            this.school = school;
            return this;
        }

        public Student build() {
            Student student = new Student(this);
            return student;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNum=" + rollNum +
                ", age=" + age +
                ", school='" + school + '\'' +
                '}';
    }
}
