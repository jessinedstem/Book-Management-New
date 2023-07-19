//package com.example.restapi.BookManagementNew.exception;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class ExceptionHandle {
//
//    @ExceptionHandler(BookNotFoundException.class)
//    public ResponseEntity<String> handleBookNotFoundException(BookNotFoundException ex) {
//        String errorMessage = ex.getMessage();
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
//    }
//}
