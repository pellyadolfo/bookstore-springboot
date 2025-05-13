package com.example.bookstore.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import com.example.bookstore.repository.OrderRepository;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

   @Mock
   private OrderRepository orderRepository;
   
   @InjectMocks
   OrderService orderService;
   
   @Mock
   private ModelMapper modelMapper;
      
   @Test
   @Ignore
   public void createOrderFromCartTest() {
	   
   }
   
   @Test
   @Ignore
   public void getOrderByIdTest() {
	   
   }

}