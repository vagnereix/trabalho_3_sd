package sd.ufc.spring.controller;

import org.springframework.http.ResponseEntity;
import sd.ufc.spring.model.Book;
import sd.ufc.spring.model.Magazine;
import java.util.List;

public interface LibraryControllerInterface {
  ResponseEntity<String> addBook(Book book);

  ResponseEntity<List<Book>> listBooks();

  ResponseEntity<String> addMagazine(Magazine magazine);

  ResponseEntity<List<Magazine>> listMagazines();
}