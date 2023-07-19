package com.example.restapi.BookManagementNew.controller;

import com.example.restapi.BookManagementNew.exception.BookNotFoundException;
import com.example.restapi.BookManagementNew.model.Book;
import com.example.restapi.BookManagementNew.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
private final BookService bookService;
@Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping
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
    }
    @PostMapping
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
