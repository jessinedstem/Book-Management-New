package com.example.restapi.BookManagementNew.Service;

import com.example.restapi.BookManagementNew.Model.Book;
import com.example.restapi.BookManagementNew.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {
    private final BookRepository bookRepository;
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book createBooks(Book book) {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book=bookRepository.findById(id).orElse(null);
        if(book!=null) {
            book.setTitle(bookDetails.getTitle());
            book.setAuthor(bookDetails.getAuthor());
            book.setIsbn(bookDetails.getIsbn());
            book.setPublicationDate(bookDetails.getPublicationDate());
            return bookRepository.save(book);
        }
        return null;
    }

    public boolean deleteBook(Long id) {
        bookRepository.deleteById(id);
        return false;
    }
}


