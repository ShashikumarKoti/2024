package com.example.jdbc.repo;

import com.example.jdbc.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class BookRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int save(Book book) {
        String query = "insert into Books (name, price) values (?,?)";
         return jdbcTemplate.update(query, book.getName(), book.getPrice());
    }

    public Book findByID(Long id) {
        String query = "select * from Books where id = ?";
        return jdbcTemplate.queryForObject(query,BOOK_ROW_MAPPER,id);
    }

    private static final RowMapper<Book> BOOK_ROW_MAPPER = (rs, rowNum) -> {
        Book book = new Book();
        book.setId(rs.getLong("id"));
        book.setName(rs.getString("name"));
        book.setPrice(rs.getBigDecimal("price"));

        return book;
    };

// Approach-2 to get book by id
//    public Optional<Book> findByID(Long id) {
//        return namedParameterJdbcTemplate.queryForObject("select * from Books where id = :id",
//                new MapSqlParameterSource("id", id),
//        (rs,rowNum) ->
//                Optional.of(new Book(
//                        rs.getLong("id"),
//                rs.getString("name"),
//                rs.getBigDecimal("price")
//                ))
//        );
//    }

    public List<Book> getAllBooks() {
        String query = "select * from Books";
        return jdbcTemplate.query(query, BOOK_ROW_MAPPER);
    }

    public int update(Book book, Long id) {
        String query = "update Books set price = ? where id = ?";
        return jdbcTemplate.update(query, book.getPrice(), id);
    }

}
