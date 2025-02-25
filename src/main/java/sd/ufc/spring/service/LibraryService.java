package sd.ufc.spring.service;

import org.springframework.stereotype.Service;
import java.util.UUID;

import sd.ufc.spring.model.Book;
import sd.ufc.spring.model.Library;
import sd.ufc.spring.model.Magazine;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
  private Library library;

  public LibraryService() {
    // Inicializa com listas vazias
    this.library = new Library(new ArrayList<>(), new ArrayList<>());
  }

  public void addBook(Book book) {
    if (book.getId() == null) {
      book.setId(UUID.randomUUID().toString());
    }

    library.getBooks().add(book);
    System.out.println("[LibraryService] Livro adicionado: " + book.getTitle());
  }

  public void addMagazine(Magazine magazine) {
    if (magazine.getId() == null) {
      magazine.setId(UUID.randomUUID().toString());
    }

    library.getMagazines().add(magazine);
    System.out.println("[LibraryService] Revista adicionada: " + magazine.getTitle());
  }

  public List<Book> listBooks() {
    return library.getBooks();
  }

  public List<Magazine> listMagazines() {
    return library.getMagazines();
  }
}