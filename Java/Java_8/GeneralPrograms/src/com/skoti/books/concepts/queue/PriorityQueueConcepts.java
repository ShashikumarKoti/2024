package com.skoti.books.concepts.queue;

import java.util.PriorityQueue;

public class PriorityQueueConcepts {

    public static void main(String[] args) {

        System.out.println("Priority queue maintains Natural sorting order");
        var priorityQueue = new PriorityQueue();
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());
      //  System.out.println(priorityQueue.element());  //Since queue is empty, it throws NoSuchElementException
        priorityQueue.offer("B");
        priorityQueue.offer("Z");
        priorityQueue.offer("A");
        priorityQueue.offer("E");
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
    }
}
