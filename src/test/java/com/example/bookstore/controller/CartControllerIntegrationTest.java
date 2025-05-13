package com.example.bookstore.controller;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartControllerIntegrationTest {

    @Autowired
    WebApplicationContext context;
    
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