package com.skoti.books.concepts.map;

import java.util.Hashtable;

public class HashtableConcepts {

    public static void main(String[] args) {

        System.out.println("null values are NOT allowed in Hashtable");
        var hashtable = new Hashtable<>();
        hashtable.put("zeeshan",500);
        hashtable.put("nagarjun",100);
        hashtable.put("ballaiah", 700);
        hashtable.put("chiru", 400);
        hashtable.put("ballaiah", 900);

        System.out.println(hashtable);

        var hashtableWithNull = new Hashtable<>();
        hashtableWithNull.put("zeeshan",500);
        hashtableWithNull.put("nagarjun",100);
        hashtableWithNull.put("ballaiah", 700);
        hashtableWithNull.put("chiru", null);
        hashtableWithNull.put("chiru", 400);
        hashtableWithNull.put("ballaiah", 900);

        System.out.println(hashtable);
    }
}
