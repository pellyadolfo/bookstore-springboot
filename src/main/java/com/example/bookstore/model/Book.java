package com.example.bookstore.model;

import org.springframework.test.context.jdbc.Sql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
@Sql(scripts = {"/import_books.sql"}, executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD)
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String author;
    private String isbn;
    private Double price;
    private Integer stockQuantity;
    
}
