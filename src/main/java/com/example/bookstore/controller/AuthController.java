package com.example.bookstore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.dto.UserDTO;
import com.example.bookstore.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final UserService userService;
    
    public AuthController(UserService userService) {
        this.userService = userService;
    }
    
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody UserDTO userDTO) {
        userService.registerUser(userDTO);
        return ResponseEntity.ok("User registered successfully");
    }
    
}
