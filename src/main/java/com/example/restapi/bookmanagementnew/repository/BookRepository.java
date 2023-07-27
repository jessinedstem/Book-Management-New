package com.example.restapi.bookmanagementnew.repository;
import com.example.restapi.bookmanagementnew.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;
public interface BookRepository extends JpaRepository<Book, Long>
{
    List<Book> findByPublicationDateBefore(LocalDate date);
}

