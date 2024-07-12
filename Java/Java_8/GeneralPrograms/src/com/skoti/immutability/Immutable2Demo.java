package com.skoti.immutability;

public class Immutable2Demo {

    public static void main(String[] args) {

        Address address = new Address();
        address.setCity("Blore");

        Immutable2 immutable2 = new Immutable2("Shashi", 35, address);
        System.out.println(immutable2.getName());
        System.out.println(immutable2.getAge());
        System.out.println(immutable2.getAddress().getCity());

        System.out.println("After changing address");
        address.setCity("Hospet");
        System.out.println(immutable2.getName());
        System.out.println(immutable2.getAge());
        System.out.println(immutable2.getAddress().getCity());

    }
}
