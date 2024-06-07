package com.skoti.books.concepts.map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapConcepts {

    public static void main(String[] args) {

        System.out.println("Normal Hashmap uses .equals()[meant for content comparison] method to identify duplicate keys");

        var normalHashMap = new HashMap();
        var int1 = new Integer(1);
        var int2 = new Integer(1) ;
        normalHashMap.put(int1,500);
        normalHashMap.put(int2,500);
        System.out.println(normalHashMap);

        System.out.println("IdentityHashMap Hashmap uses ==[meant for address comparison] method to identify duplicate keys");
        Map identityHashMap = new IdentityHashMap();
        identityHashMap.put(int1,500);
        identityHashMap.put(int2,500);
        System.out.println(identityHashMap);
    }
}
