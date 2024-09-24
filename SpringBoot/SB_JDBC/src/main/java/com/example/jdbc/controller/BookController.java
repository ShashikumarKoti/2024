package com.example.jdbc.controller;

import com.example.jdbc.model.Book;
import com.example.jdbc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    public ResponseEntity<Integer> saveBook(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.persistBook(book),HttpStatus.CREATED);
    }

    @GetMapping("/book/{id}")
    public ResponseEntity<Book> findBookById(@PathVariable("id") Long bookID) {
        return new ResponseEntity<>(bookService.findById(bookID),HttpStatus.OK);
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> bookList = bookService.findAllBooks();
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }

    @PutMapping("/book/{id}")
    public ResponseEntity<Integer> updateBook(@RequestBody Book book, @PathVariable("id") Long bookId) {
        return new ResponseEntity<>(bookService.updateBook(book,bookId),HttpStatus.CREATED);
    }

}
