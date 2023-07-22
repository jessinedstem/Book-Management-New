package com.example.restapi.bookmanagementnew.repository;

import com.example.restapi.bookmanagementnew.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {}
