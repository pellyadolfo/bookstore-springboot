package com.example.bookstore.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.bookstore.repository.CartRepository;

@ExtendWith(SpringExtension.class)
public class CartServiceTest {

   @Mock
   private CartRepository cartRepository;
   
   //@InjectMocks
   //CartService cartService;
   
   @Mock
   private ModelMapper modelMapper;
      
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
   
   @Test
   @Disabled
   public void createNewCartTest() {
	   
   }
}