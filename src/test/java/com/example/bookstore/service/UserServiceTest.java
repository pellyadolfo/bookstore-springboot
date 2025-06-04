package com.example.bookstore.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.modelmapper.ModelMapper;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.bookstore.repository.UserRepository;

@ExtendWith(SpringExtension.class)
public class UserServiceTest {

   @Mock
   private UserRepository userRepository;
   
   @InjectMocks
   UserService userService;
   
   @Mock
   private ModelMapper modelMapper;
      
   @Test
   @Disabled
   public void registerUserTest() {
	   
   }

}