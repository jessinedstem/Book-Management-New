package com.example.restapi.bookmanagementnew.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(Long id) {
        super("Book not exist:"+id);
    }
}
