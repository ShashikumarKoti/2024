package com.example.jdbc.service;

import com.example.jdbc.model.Book;
import com.example.jdbc.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public int persistBook(Book book) {
       return bookRepository.save(book);
    }

    public Book findById(Long bookID) {
        System.out.println("book id in service is: " + bookID);
        return bookRepository.findByID(bookID);

    }
}
