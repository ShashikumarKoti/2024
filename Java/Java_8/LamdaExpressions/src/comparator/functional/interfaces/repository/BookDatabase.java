package comparator.functional.interfaces.repository;

import comparator.functional.interfaces.dto.Book;

import java.util.Arrays;
import java.util.List;

public class BookDatabase {

  public List<Book> getBooks() {
    return Arrays.asList(
        new Book("Rich Dad, Poor Dad", "500"),
        new Book("Twilight", "300"),
        new Book("Catching Fire", "700"));
  }
}
