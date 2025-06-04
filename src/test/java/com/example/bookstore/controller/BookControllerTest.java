package com.example.bookstore.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.example.bookstore.service.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(BookController.class)
@Disabled
public class BookControllerTest {

    @MockBean
    private BookService bookService;
    
    ObjectMapper objectMapper = new ObjectMapper();
    
    @Autowired
    private MockMvc mockMvc;
    
    @Disabled
    public void getAllBooksTest() throws Exception {
    	
		
    }
    
    @Test
    @Disabled
    public void getBookByIdTest() {
    	
    }
    
    @Test
    @Disabled
    public void createBookTest() {
    	
    }
    
    @Test
    @Disabled
    public void updateBookTest() {
    	
    }
    
    @Test
    @Disabled
    public void deleteBookTest() {
    	
    }
   
}