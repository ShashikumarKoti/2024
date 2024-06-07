package com.skoti.books.concepts.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomSortingConcepts {

    public static void main(String[] args) {
        var priorityQueue = new PriorityQueue(new CustomComparator());
        priorityQueue.offer("B");
        priorityQueue.offer("Z");
        priorityQueue.offer("A");
        priorityQueue.offer("E");

        System.out.println(priorityQueue);
    }
}


class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str2.compareTo(str1);
    }
}