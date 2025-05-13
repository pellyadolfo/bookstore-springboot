// BookRepository.java
package com.example.bookstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findById(Integer bookId);
}
