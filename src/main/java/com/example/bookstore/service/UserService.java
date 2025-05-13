package com.example.bookstore.service;

import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.bookstore.dto.UserDTO;
import com.example.bookstore.exception.ResourceAlreadyExistsException;
import com.example.bookstore.model.User;
import com.example.bookstore.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;
    
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
    }
        
    public void registerUser(UserDTO userDTO) {
        if (userRepository.existsByUsername(userDTO.getUsername())) {
            throw new ResourceAlreadyExistsException("Username is already taken");
        }
        
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            throw new ResourceAlreadyExistsException("Email is already in use");
        }
        
        User user = modelMapper.map(userDTO, User.class);
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userRepository.save(user);
    }
}
