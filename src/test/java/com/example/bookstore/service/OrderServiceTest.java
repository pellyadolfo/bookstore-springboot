package com.example.bookstore.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.bookstore.repository.OrderRepository;

@ExtendWith(SpringExtension.class)
public class OrderServiceTest {

   @Mock
   private OrderRepository orderRepository;
   
   @InjectMocks
   OrderService orderService;
   
   @Mock
   private ModelMapper modelMapper;
      
   @Test
   @Disabled
   public void createOrderFromCartTest() {
	   
   }
   
   @Test
   @Disabled
   public void getOrderByIdTest() {
	   
   }

}