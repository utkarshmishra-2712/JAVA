package com.kiet.library.controller;
import com.kiet.library.service.BookService;
import com.kiet.library.model.Book;


import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    // @Autowired
    private final BookService bookService;

    // Constructor injection
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // 1. GET all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // 2. GET book by ID
    @GetMapping("/{bookId}")
    public ResponseEntity<?> getBookById(
            @PathVariable int bookId) {

        Book book = bookService.getBookById(bookId);

        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "Book not found"));
        }

        return ResponseEntity.ok(book);
    }

    // 3. POST add a new book
    @PostMapping
    public ResponseEntity<Book> addBook(
            @RequestBody Book book) {

        Book savedBook = bookService.addBook(book);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedBook);
    }

    // 4. PUT update an existing book
    @PutMapping("/{bookId}")
    public ResponseEntity<?> updateBook(
            @PathVariable int bookId,
            @RequestBody Book updatedBook) {

        Book book = bookService.updateBook(bookId, updatedBook);

        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "Book not found"));
        }

        return ResponseEntity.ok(book);
    }

    // 5. DELETE a book
    @DeleteMapping("/{bookId}")
    public ResponseEntity<?> deleteBook(
            @PathVariable int bookId) {

        boolean deleted = bookService.deleteBook(bookId);

        if (!deleted) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "Book not found"));
        }

        return ResponseEntity.ok(
                Map.of("message", "Book deleted successfully"));
    }

    // 6. Search books by category
    @GetMapping("/search")
    public ResponseEntity<List<Book>> searchByCategory(
            @RequestParam String category) {

        List<Book> result =
                bookService.searchByCategory(category);

        return ResponseEntity.ok(result);
    }

    // 7. Find books published from a given year
    @GetMapping("/published")
    public ResponseEntity<List<Book>> findPublishedFromYear(
            @RequestParam int fromYear) {

        List<Book> result =
                bookService.findPublishedFromYear(fromYear);

        return ResponseEntity.ok(result);
    }
}