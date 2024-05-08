package comparator.functional.interfaces;

import comparator.functional.interfaces.dto.Book;
import comparator.functional.interfaces.repository.BookDatabase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookComparatorUsingLambda {
  public static void main(String[] args) {
    List<Book> bookList1 = new BookDatabase().getBooks();
    System.out.println("Book List1 before sorting " + bookList1);
    Collections.sort(
        bookList1, (book1, book2) -> book2.getPages().compareTo(book1.getPages()));
    System.out.println("Sorted books via lambda : " + bookList1);

    List<Book> bookList2 = new BookDatabase().getBooks();
    System.out.println("Book List2 before sorting " + bookList2);
    Collections.sort(bookList2, Comparator.comparing(Book::getPages).reversed());
    System.out.println("Sorted books via Comparator.comparing : " + bookList2);

    //using streams
    List<Book> bookList3 = new BookDatabase().getBooks();
    bookList3.stream().sorted(Comparator.comparing(Book::getName)).forEach(System.out::println);
  }
}
