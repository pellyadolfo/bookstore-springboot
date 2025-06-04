package com.example.bookstore.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.context.WebApplicationContext;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CartControllerIntegrationTest {

    @Autowired
    WebApplicationContext context;
    
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
    @Disabled
    public void clearCartTest() {
    	
    }
   
}