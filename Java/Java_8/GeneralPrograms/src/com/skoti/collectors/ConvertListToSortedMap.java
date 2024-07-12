package com.skoti.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToSortedMap {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));

        Map<String, String> bookMap = bookList.stream().collect(
                Collectors.toMap(Book::getName, Book::getIsbn, (b1, b2)-> b1, TreeMap::new));
        bookMap.forEach(
                (String name, String isbn) -> System.out.println("Name:" + name + " Isbn:" + isbn )
        );


    }
}
