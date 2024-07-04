package com.skoti.immutability;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2","second");

        Immutable immutable = new Immutable("Koti", 33, map);
        System.out.println(immutable.getName());
        System.out.println(immutable.getRegNum());
        System.out.println(immutable.getMetadata());

        map.put("3", "three");
        System.out.println(immutable.getMetadata());

        immutable.getMetadata().put("4", "fourth");
        System.out.println(immutable.getMetadata());


    }
}
