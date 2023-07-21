package com.example.restapi.BookManagementNew.repository;

import com.example.restapi.BookManagementNew.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
