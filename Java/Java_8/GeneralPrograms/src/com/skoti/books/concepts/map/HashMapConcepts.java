package com.skoti.books.concepts.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapConcepts {

    public static void main(String[] args) {

        System.out.println("null values are allowed in HashMap");
        var stringIntegerMap = new HashMap();
        stringIntegerMap.put("zeeshan",500);
        stringIntegerMap.put("nagarjun",100);
        stringIntegerMap.put("ballaiah", 700);
        stringIntegerMap.put("chiru", null);
        stringIntegerMap.put("chiru", 400);
        stringIntegerMap.put("ballaiah", 900);

        System.out.println("HashMap - Best choice for Search operation");
        System.out.println("HashMap - insertion order NOT preserved | heterogeneous objects allowed | implements Serializable, Cloneable ");
        System.out.println(stringIntegerMap);
        System.out.println("Keys:" + stringIntegerMap.keySet());
        System.out.println("Values "+ stringIntegerMap.values());
        System.out.println("EntrySet: "+ stringIntegerMap.entrySet());

        var entrySet = stringIntegerMap.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            System.out.println("Key "+ entry.getKey() + " & value "+ entry.getValue());
        }

    }
}
