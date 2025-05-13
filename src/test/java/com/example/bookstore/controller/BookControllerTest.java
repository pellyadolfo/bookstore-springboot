package com.example.bookstore.controller;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.bookstore.dto.UserDTO;
import com.example.bookstore.service.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(BookController.class)
@Ignore
public class BookControllerTest {

    @MockBean
    BookService bookService;
    
    ObjectMapper objectMapper = new ObjectMapper();
    
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void getAllBooksTest() throws Exception {
    	
    	UserDTO user = new UserDTO();
    	user.setUsername("testuser");
    	user.setPassword("testpassword");
    	user.setEmail("testemail");
    	ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
    	
    	// When
    	mockMvc.perform(post("/api/auth/register")
    			.contentType(MediaType.APPLICATION_JSON)
    			.with(csrf())
    			.content(json))
    			.andExpect(status().isOk());
    	
    	// Given
    	/*BookDTO bookDTO = new BookDTO();
    	bookDTO.setTitle("Bible");
    	doReturn(Arrays.asList(bookDTO)).when(bookService).getAllBooks();
    	when(bookService.getAllBooks()).thenReturn(Arrays.asList(bookDTO));
    	
    	// When
    	mockMvc.perform(get("/api/books")
    			//.with(user("admin").password("pass").roles("SIMPLE_USER"))
    			.contentType(MediaType.APPLICATION_JSON)
    			.with(SecurityMockMvcRequestPostProcessors.httpBasic("testuser","password")))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Bible"));*/
		
    }
    
    @Test
    @Ignore
    public void getBookByIdTest() {
    	
    }
    
    @Test
    @Ignore
    public void createBookTest() {
    	
    }
    
    @Test
    @Ignore
    public void updateBookTest() {
    	
    }
    
    @Test
    @Ignore
    public void deleteBookTest() {
    	
    }
   
}