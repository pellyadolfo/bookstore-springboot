package com.example.bookstore.service;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;

import com.example.bookstore.repository.UserRepository;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {

   @Mock
   private UserRepository userRepository;
   
   @InjectMocks
   UserService userService;
   
   @Mock
   private ModelMapper modelMapper;
      
   @Test
   @Ignore
   public void registerUserTest() {
	   
   }

}