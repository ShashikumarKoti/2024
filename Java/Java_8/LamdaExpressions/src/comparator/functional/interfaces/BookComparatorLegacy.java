package comparator.functional.interfaces;

import comparator.functional.interfaces.dto.Book;
import comparator.functional.interfaces.repository.BookDatabase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookComparatorLegacy {
  public static void main(String[] args) {
    List<Book> bookList = new BookDatabase().getBooks();
    Collections.sort(bookList, new MyComparator());
    System.out.println(bookList);
  }
}

class MyComparator implements Comparator<Book> {

  @Override
  public int compare(Book book1, Book book2) {
    return book1.getName().compareTo(book2.getName());
  }
}
