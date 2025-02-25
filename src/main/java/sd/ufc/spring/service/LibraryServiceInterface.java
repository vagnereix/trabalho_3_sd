package sd.ufc.spring.service;

import sd.ufc.spring.model.Book;
import sd.ufc.spring.model.Magazine;
import java.util.List;

public interface LibraryServiceInterface {
  void addBook(Book book);

  void addMagazine(Magazine magazine);

  List<Book> listBooks();

  List<Magazine> listMagazines();
}