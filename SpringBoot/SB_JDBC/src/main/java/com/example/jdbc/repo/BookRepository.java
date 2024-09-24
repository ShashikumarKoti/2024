package com.example.jdbc.repo;

import com.example.jdbc.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Book book) {
         return jdbcTemplate.update("insert into Books (name, price) values (?,?)", book
                .getName(), book.getPrice());
    }
}
