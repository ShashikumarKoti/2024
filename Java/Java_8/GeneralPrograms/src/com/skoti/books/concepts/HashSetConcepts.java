package com.skoti.books.concepts;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcepts {

    public static void main(String[] args) {

        Set stringSet = new HashSet();
        stringSet.add("Ram");
        stringSet.add("Zeeshan");
        stringSet.add("Abhi");
        stringSet.add(null);
        stringSet.add("Zeeshan");

        System.out.println("Use HashSet if frequent operation is searching");
        System.out.println("HashSet - Duplicates are not allowed | insertion order not maintained | null is allowed | Implements Serializable, Cloneable interface | Heterogeneous objects allowed");
        System.out.println(stringSet);

        Set mixedObjectsSet = new HashSet();
        mixedObjectsSet.add(5);
        mixedObjectsSet.add("Zeeshan");
        mixedObjectsSet.add("Abhi");
        mixedObjectsSet.add(10);
        mixedObjectsSet.add("Zeeshan");

        System.out.println(mixedObjectsSet);

        Set integerSet = new HashSet();
        integerSet.add(5);
        integerSet.add(7);
        integerSet.add(2);
        integerSet.add(10);
        integerSet.add(4);

        System.out.println(integerSet);
    }
}

