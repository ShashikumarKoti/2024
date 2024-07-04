package com.skoti.immutability;

public class HashCodeEqualsOverrideDemo {

    public static void main(String[] args) {

        Student student = new Student("Koti",333);
        Student student2 = new Student("Koti",333);

        if (student.equals(student2)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

    }
}
