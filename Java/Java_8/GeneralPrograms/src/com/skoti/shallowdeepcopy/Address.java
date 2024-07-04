package com.skoti.shallowdeepcopy;

public class Address implements  Cloneable{
    private String city;
    private long pincode;

    public Address(String city, long pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Address )super.clone();
    }
}
