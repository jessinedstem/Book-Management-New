package com.example.restapi.BookManagementNew.Repository;

import com.example.restapi.BookManagementNew.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
