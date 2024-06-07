package com.skoti.books.concepts;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcepts {

    public static void main(String[] args) {

        Set stringSet = new LinkedHashSet();
        stringSet.add("Ram");
        stringSet.add("Zeeshan");
        stringSet.add("Abhi");
        stringSet.add(null);
        stringSet.add("Zeeshan");

        System.out.println("Use LinkedHashSet to develop caches");
        System.out.println("LinkedHashSet - Duplicates are not allowed | Insertion order maintained | null is allowed | Implements Serializable, Cloneable interface | Heterogeneous objects allowed");
        System.out.println(stringSet);

        Set mixedObjectsSet = new LinkedHashSet();
        mixedObjectsSet.add(5);
        mixedObjectsSet.add("Zeeshan");
        mixedObjectsSet.add("Abhi");
        mixedObjectsSet.add(10);
        mixedObjectsSet.add("Zeeshan");

        System.out.println(mixedObjectsSet);

        Set integerSet = new LinkedHashSet();
        integerSet.add(5);
        integerSet.add(7);
        integerSet.add(2);
        integerSet.add(10);
        integerSet.add(4);

        System.out.println(integerSet);
    }
}
