package sd.ufc.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;

import sd.ufc.spring.model.Book;
import sd.ufc.spring.model.Magazine;
import sd.ufc.spring.service.LibraryService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibraryController implements LibraryControllerInterface {

  @Autowired
  private LibraryService libraryService;

  // Endpoint para adicionar um livro
  @Operation(summary = "Adiciona um novo livro")
  @PostMapping("/books")
  public ResponseEntity<String> addBook(@RequestBody Book book) {
    libraryService.addBook(book);
    return ResponseEntity.ok("Livro adicionado com sucesso");
  }

  // Endpoint para listar os livros
  @Operation(summary = "Lista todos os livros")
  @GetMapping("/books")
  public ResponseEntity<List<Book>> listBooks() {
    List<Book> books = libraryService.listBooks();
    return ResponseEntity.ok(books);
  }

  // Endpoint para adicionar uma revista
  @Operation(summary = "Adiciona uma nova revista")
  @PostMapping("/magazines")
  public ResponseEntity<String> addMagazine(@RequestBody Magazine magazine) {
    libraryService.addMagazine(magazine);
    return ResponseEntity.ok("Revista adicionada com sucesso");
  }

  // Endpoint para listar as revistas
  @Operation(summary = "Lista todas as revistas")
  @GetMapping("/magazines")
  public ResponseEntity<List<Magazine>> listMagazines() {
    List<Magazine> magazines = libraryService.listMagazines();
    return ResponseEntity.ok(magazines);
  }
}