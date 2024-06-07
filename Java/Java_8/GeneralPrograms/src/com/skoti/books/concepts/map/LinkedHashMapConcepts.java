package com.skoti.books.concepts.map;

import java.util.*;

public class LinkedHashMapConcepts {

    public static void main(String[] args) {

        System.out.println("null values are allowed in LinkedHashMap");
        Map stringIntegerMap = new LinkedHashMap();
        stringIntegerMap.put("zeeshan",500);
        stringIntegerMap.put("nagarjun",100);
        stringIntegerMap.put("ballaiah", 700);
        stringIntegerMap.put("ballaiah", null);
        stringIntegerMap.put("chiru", 400);
        stringIntegerMap.put("ballaiah", 900);

        System.out.println("LinkedHashMap - Best choice for developing cache based applications");
        System.out.println("LinkedHashMap - insertion order IS preserved | heterogeneous objects allowed | implements Serializable, Cloneable ");
        System.out.println(stringIntegerMap);
        System.out.println("Keys:" + stringIntegerMap.keySet());
        System.out.println("Values "+ stringIntegerMap.values());
        System.out.println("EntrySet: "+ stringIntegerMap.entrySet());

        Set entrySet = stringIntegerMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("Key "+ entry.getKey() + " & value "+ entry.getValue());
        }

    }
}
