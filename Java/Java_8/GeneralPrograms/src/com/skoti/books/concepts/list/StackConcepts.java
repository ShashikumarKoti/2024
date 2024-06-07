package com.skoti.books.concepts.list;

import java.util.Stack;

public class StackConcepts {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("A");
        stack.push("Shashi");
        stack.push(null);
        stack.push(5);
        stack.push("Hello");
        stack.push(10);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.search("Shashi"));
        System.out.println(stack.search(10));

    }
}
