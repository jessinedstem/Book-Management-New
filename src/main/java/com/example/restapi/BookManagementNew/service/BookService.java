package com.example.restapi.BookManagementNew.service;

import com.example.restapi.BookManagementNew.model.Book;
import com.example.restapi.BookManagementNew.repository.BookRepository;
<<<<<<< Updated upstream
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
=======
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
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
=======
    public BookDto getBookById(Long id) {
        Book book =
                bookRepository
                        .findById(id)
                        .orElseThrow(
                                () ->
                                        new IllegalArgumentException(
                                                "Book not found with ID: " + id));
        return modelMapper.map(book, BookDto.class);
    }

    public BookDto addBook(BookDto bookDto) {
        Book book = modelMapper.map(bookDto, Book.class);
        Book savedBook = bookRepository.save(book);
        return modelMapper.map(savedBook, BookDto.class);
    }

    //    public BookDto updateBook(Long id, BookDto bookDto) {
    //        Book existingBook = bookRepository.findById(id)
    //                .orElseThrow(() -> new IllegalArgumentException("Book not found with ID: " +
    // id));
    //        existingBook.setTitle(bookDto.getTitle());
    //        existingBook.setAuthor(bookDto.getAuthor());
    //        existingBook.setIsbn(bookDto.getIsbn());
    //        existingBook.setPublicationDate(bookDto.getPublicationDate());
    //
    //        Book updatedBook = bookRepository.save(existingBook);
    //        return modelMapper.map(updatedBook, BookDto.class);
    //    }

    public void deleteBook(Long id) {}

    public void deleteBook(long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Book not found with ID: " + id);
>>>>>>> Stashed changes
        }
        return null;
    }

    public boolean deleteBook(Long id) {
        bookRepository.deleteById(id);
        return false;
    }
}
<<<<<<< Updated upstream


=======
>>>>>>> Stashed changes
