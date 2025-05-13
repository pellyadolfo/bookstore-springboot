package com.example.bookstore.controller;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.bookstore.service.OrderService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(CartController.class)
public class OrderControllerTest {

    @MockBean
    OrderService orderService;
    
    ObjectMapper objectMapper = new ObjectMapper();
    
    @Autowired
    private MockMvc mockMvc;
        
    @Test
    @Ignore
    public void createOrderFromCartTest() {
    	
    }
    
    @Test
    @Ignore
    public void getOrderByIdTest() {
    	
    }
    
    @Test
    @Ignore
    public void getOrdersByUserIdTest() {
    	
    }
    
}