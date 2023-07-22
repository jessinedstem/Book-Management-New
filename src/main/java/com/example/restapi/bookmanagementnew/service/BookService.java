package com.example.restapi.bookmanagementnew.service;

import com.example.restapi.bookmanagementnew.dto.BookDto;
import com.example.restapi.bookmanagementnew.model.Book;
import com.example.restapi.bookmanagementnew.repository.BookRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
@Service
public class BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;
@Autowired
    public BookService(BookRepository bookRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
    }
    public List<BookDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream()
                .map(book -> modelMapper.map(book,BookDto.class))
                .collect(Collectors.toList());
    }

    public BookDto getBookById(Long id) {
        Book getBook = bookRepository.findById(id).orElseThrow(()->{
           return new IllegalArgumentException("Book not found with ID: " + id);
        });
        return modelMapper.map(getBook, BookDto.class);
    }

    public BookDto addBook(@Valid BookDto bookDto) {
        Book book = bookRepository.save(modelMapper.map(bookDto, Book.class));
        return modelMapper.map(book, BookDto.class);
    }

    public BookDto updateBookById(Long id, @Valid BookDto bookDto) {
        Book bookToUpdate = bookRepository.findById(id).orElseThrow(() ->{
            return new IllegalArgumentException("Book not found with ID: " + id);
        });
        modelMapper.map(bookDto,bookToUpdate);
        Book updatedBook = bookRepository.save(bookToUpdate);
        return modelMapper.map(updatedBook, BookDto.class);
    }
    public void deleteBook(Long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
        }
        else {
            throw new IllegalArgumentException("Book not found with ID: " + id);
        }
    }
}