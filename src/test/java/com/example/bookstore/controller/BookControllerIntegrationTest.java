package com.example.bookstore.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookControllerIntegrationTest {

    @Autowired
    WebApplicationContext context;
    
    @Test
    @Ignore
    public void getAllBooksTest() throws Exception {
    	
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        mockMvc.perform(MockMvcRequestBuilders
        			.post("/f")
                    .param("db", "gasclick")
                    .param("col", "PE_USER")
                    .param("find", "{ \"alerts\" : { \"$geoIntersects\" : { \"$geometry\" : { \"type\" : \"Point\" , \"coordinates\" : [ -77.03134639999999 , -12.125069]}}}}")
        			.accept(MediaType.APPLICATION_JSON_VALUE)
        			.contentType(MediaType.APPLICATION_JSON)
        	)
        	//.andDo(print())
        	.andExpect(status().isOk())
        	.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
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