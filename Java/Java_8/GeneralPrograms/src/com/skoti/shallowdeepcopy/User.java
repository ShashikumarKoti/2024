package com.skoti.shallowdeepcopy;

public class User implements Cloneable {

    private String name;
    private int id;
    private Address address;

    public User(String name, int id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address=" + address +
                '}';
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        User user = null;
        user = (User) super.clone();
        user.address = (Address) this.address.clone();
        return user;
    }
}
