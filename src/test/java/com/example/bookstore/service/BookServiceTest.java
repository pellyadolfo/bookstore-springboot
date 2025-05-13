package com.example.bookstore.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import com.example.bookstore.dto.BookDTO;
import com.example.bookstore.model.Book;
import com.example.bookstore.repository.BookRepository;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

   @Mock
   private BookRepository bookRepository;
   
   @InjectMocks
   BookService bookService;
   
   @Mock
   private ModelMapper modelMapper;
      
   @Test
   public void getAllBooksTest() {
	   
	   Book book = new Book();
	   when(bookRepository.findAll()).thenReturn(Arrays.asList(book));
	   
	   assertEquals(bookService.getAllBooks().size(), 1);
	   
   }
   
   @Test
   public void canCreateBookTest() {
	   
	   BookDTO bookDTO = new BookDTO();
	   bookDTO.setId(1L);
	   bookDTO.setTitle("testtitle");
	   Book book = new Book();
	   book.setId(1L);
	   book.setTitle("testtitle");	   
	   when(bookRepository.save(any())).thenReturn(book);
	   when(modelMapper.map(any(BookDTO.class), any())).thenReturn(book);
	   when(modelMapper.map(any(Book.class), any())).thenReturn(bookDTO);

	   BookDTO book3 = bookService.createBook(bookDTO);
	   assertEquals(bookDTO.getTitle(), book3.getTitle());
	   
   }
   
   @Test
   @Ignore
   public void canUpdateBookTest() {
	   
	   
   }

   @Test
   @Ignore
   public void canDeleteBookTest() {
	   
	   
   }

   
}