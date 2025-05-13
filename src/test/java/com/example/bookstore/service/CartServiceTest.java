package com.example.bookstore.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import com.example.bookstore.repository.CartRepository;

@RunWith(MockitoJUnitRunner.class)
public class CartServiceTest {

   @Mock
   private CartRepository cartRepository;
   
   @InjectMocks
   CartService cartService;
   
   @Mock
   private ModelMapper modelMapper;
      
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
   
   @Test
   @Ignore
   public void createNewCartTest() {
	   
   }
}