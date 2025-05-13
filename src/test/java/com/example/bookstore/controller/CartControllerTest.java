package com.example.bookstore.controller;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.bookstore.service.CartService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(CartController.class)
public class CartControllerTest {

    @MockBean
    CartService cartService;
    
    ObjectMapper objectMapper = new ObjectMapper();
    
    @Autowired
    private MockMvc mockMvc;
        
    @Test
    @Ignore
    public void getCartByUserIdTest() {
    	
    }
    
    @Test
    @Ignore
    public void addItemToCartTest() {
    	
    }
    
    @Test
    @Ignore
    public void removeItemFromCartTest() {
    	
    }
    
    @Test
    @Ignore
    public void clearCartTest() {
    	
    }
   
}