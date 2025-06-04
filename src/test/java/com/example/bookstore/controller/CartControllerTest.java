package com.example.bookstore.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.bookstore.service.CartService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(CartController.class)
public class CartControllerTest {

    @MockBean
    CartService cartService;
    
    ObjectMapper objectMapper = new ObjectMapper();
    
    @Autowired
    private MockMvc mockMvc;

    @Test
    @Disabled
    public void getCartByUserIdTest() {
    	
    }
    
    @Test
    @Disabled
    public void addItemToCartTest() {
    	
    }
    
    @Test
    @Disabled
    public void removeItemFromCartTest() {
    	
    }
    
    @Test
    @ExtendWith(SpringExtension.class)    public void clearCartTest() {
    	
    }
   
}