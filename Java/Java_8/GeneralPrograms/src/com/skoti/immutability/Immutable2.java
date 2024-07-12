package com.skoti.immutability;

public final class Immutable2 {

    private String name;
    private int age;
    private Address address;

    public Immutable2(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        Address address1 = new Address();
        address1.setCity(address.getCity());
        this.address = address1;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        Address address1 = new Address();
        address1.setCity(address.getCity());
        this.address = address1;
        return address;
    }

    public int getAge() {
        return age;
    }
}


class Address {

    private String city;



    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}