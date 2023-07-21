package com.example.restapi.BookManagementNew.controller;

import com.example.restapi.BookManagementNew.exception.BookNotFoundException;
import com.example.restapi.BookManagementNew.model.Book;
import com.example.restapi.BookManagementNew.service.BookService;
<<<<<<< Updated upstream
=======
import jakarta.validation.Valid;
import java.util.List;
>>>>>>> Stashed changes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
<<<<<<< Updated upstream
import java.util.List;
=======
>>>>>>> Stashed changes

@RestController
@RequestMapping("/books")
public class BookController {
<<<<<<< Updated upstream
private final BookService bookService;
@Autowired
=======
    private final BookService bookService;

    @Autowired
>>>>>>> Stashed changes
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
<<<<<<< Updated upstream
    public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        Book book = bookService.getBookById(id);
        if (book == null) {
            throw new BookNotFoundException("Book not found for ID: " + id);
        }
    return book;
=======
    public ResponseEntity<List<BookDto>> getAllBooks() {
        List<BookDto> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable Long id) {
        BookDto book = bookService.getBookById(id);
        return ResponseEntity.ok(book);
>>>>>>> Stashed changes
    }

    @PostMapping
<<<<<<< Updated upstream
    public Book createBooks(@RequestBody Book book)
    {
        return bookService.createBooks(book);
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
        Book updatedBook = bookService.updateBook(id, bookDetails);
        if (updatedBook == null) {
            throw new BookNotFoundException("Book not found for ID: " + id);
        }
        return updatedBook;
    }
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        boolean deleted = bookService.deleteBook(id);
        if (!deleted) {
            throw new BookNotFoundException("Book not found for ID: " + id);
        }
    }
    }
=======
    public ResponseEntity<BookDto> addBook(@Valid @RequestBody BookDto bookDto) {
        BookDto savedBook = bookService.addBook(bookDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBook);
    }
    //    @PutMapping
    //    public ResponseEntity<BookDto> updateBook(@PathVariable Long id, @Valid @RequestBody
    // BookDto bookDto)
    //    {
    //        BookDto UpdatedBook=bookService.updateBook(id, bookDto);
    //        return ResponseEntity.ok(UpdatedBook);
    //    }
    @DeleteMapping
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGeneralException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
    }
}
>>>>>>> Stashed changes
