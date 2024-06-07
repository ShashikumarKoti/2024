package com.skoti.books.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListConcepts {
    public static void main(String[] args) {

        List stringArrayList = new ArrayList<>();
        stringArrayList.add("Ram");
        stringArrayList.add("Zeeshan");
        stringArrayList.add("Abhi");
        stringArrayList.add(null);
        stringArrayList.add(1);
        stringArrayList.add("Zeeshan");


        System.out.println("Use ArrayList ONLY if frequent operation is retrieval");
        System.out.println("ArrayList - Implements Serializable, Cloneable and RandomAccess interface | Duplicates are allowed | insertion order maintained | null ia allowed | heterogeneous objects allowed");
        System.out.println(stringArrayList);

        List integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(2);
        integerList.add(10);
        stringArrayList.add(null);
        integerList.add(8);
        integerList.add(4);
        integerList.add(2);


        System.out.println(integerList);

        List listFunctionalities = new ArrayList();
        listFunctionalities.add(null);
        listFunctionalities.add(5);
        listFunctionalities.add("Shashi");
        listFunctionalities.add(7);
        listFunctionalities.remove(2);
        listFunctionalities.add(2, "Koti");
        listFunctionalities.addFirst("Hello");

        System.out.println(listFunctionalities);

        //To get synchronizedList
        List simpleList = new ArrayList<>();
        List synchronizedList = Collections.synchronizedList(simpleList);


    }
}
