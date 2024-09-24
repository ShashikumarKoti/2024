package com.example.jdbc.controller;

import com.example.jdbc.model.Book;
import com.example.jdbc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public int saveBook(@RequestBody Book book) {
          return bookService.persistBook(book);
    }

    @GetMapping("/book/{id}")
    public Book findBookById(@PathVariable("id") Long bookID) {
        System.out.println("book id in controller is: " + bookID);
        return bookService.findById(bookID);
    }
}
