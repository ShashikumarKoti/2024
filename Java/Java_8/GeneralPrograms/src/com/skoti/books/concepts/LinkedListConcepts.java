package com.skoti.books.concepts;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListConcepts {

    public static void main(String[] args) {

        List stringLinkedist = new LinkedList();
        stringLinkedist.add("Ram");
        stringLinkedist.add("Zeeshan");
        stringLinkedist.add("Abhi");
        stringLinkedist.add(null);
        stringLinkedist.add(1);
        stringLinkedist.add("Zeeshan");


        System.out.println("Use LinkedList ONLY if frequent operation is insertion/deletion");
        System.out.println("LinkedList - Implements Serializable and Cloneable interface | Duplicates are allowed | insertion order maintained | null ia allowed | heterogeneous objects allowed");
        System.out.println(stringLinkedist);

        List integerLinkedList = new LinkedList<>();
        integerLinkedList.add(5);
        integerLinkedList.add(2);
        integerLinkedList.add(10);
        stringLinkedist.add(null);
        integerLinkedList.add(8);
        integerLinkedList.add(4);
        integerLinkedList.add(2);


        System.out.println(integerLinkedList);

        List linkedListFunctionalities = new LinkedList();
        linkedListFunctionalities.add(null);
        linkedListFunctionalities.add(5);
        linkedListFunctionalities.add("Shashi");
        linkedListFunctionalities.add(7);
        linkedListFunctionalities.remove(2);
        linkedListFunctionalities.add(2, "Koti");
        linkedListFunctionalities.addFirst("Hello");
        linkedListFunctionalities.remove(0);
        linkedListFunctionalities.removeLast();

        System.out.println(linkedListFunctionalities);

        //To get synchronizedLinkedList
        List simpleList = new LinkedList();
        List synchronizedLinkedList = Collections.synchronizedList(simpleList);
    }
}
