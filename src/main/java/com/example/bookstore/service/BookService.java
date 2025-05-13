package com.example.bookstore.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.bookstore.dto.BookDTO;
import com.example.bookstore.exception.ResourceNotFoundException;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;
    
    public BookService(BookRepository bookRepository, ModelMapper modelMapper) {
        this.bookRepository = bookRepository;
        this.modelMapper = modelMapper;
    }
    
    public List<BookDTO> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(book -> modelMapper.map(book, BookDTO.class))
                .collect(Collectors.toList());
    }
    
    public BookDTO getBookById(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id: " + id));
        return modelMapper.map(book, BookDTO.class);
    }
    
    public BookDTO createBook(BookDTO bookDTO) {
        Book book = modelMapper.map(bookDTO, Book.class);
        Book savedBook = bookRepository.save(book);
        return modelMapper.map(savedBook, BookDTO.class);
    }
    
    public BookDTO updateBook(Long id, BookDTO bookDTO) {
        Book existingBook = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id: " + id));
        
        modelMapper.map(bookDTO, existingBook);
        Book updatedBook = bookRepository.save(existingBook);
        return modelMapper.map(updatedBook, BookDTO.class);
    }
    
    public void deleteBook(Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with id: " + id));
        bookRepository.delete(book);
    }
}
