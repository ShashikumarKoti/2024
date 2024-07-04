package com.skoti.shallowdeepcopy;

public class ShallowCopyClient {

    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address("Blore",560076);
        User user = new User("koti",11,address);
        System.out.println(user);

        User clonedUser = user.clone();
        System.out.println(clonedUser);

        user.getAddress().setPincode(560077);
        System.out.println(user);
        System.out.println(clonedUser);
    }
}
