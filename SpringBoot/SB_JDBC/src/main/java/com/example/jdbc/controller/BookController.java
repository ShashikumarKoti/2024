package com.example.jdbc.controller;

import com.example.jdbc.model.Book;
import com.example.jdbc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public int saveBook(@RequestBody Book book) {
          return bookService.persistBook(book);
    }
}
