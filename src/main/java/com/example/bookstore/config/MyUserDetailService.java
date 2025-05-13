package com.example.bookstore.config;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.bookstore.model.User;
import com.example.bookstore.repository.UserRepository;

@Service
public class MyUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    // Constructor injection for MyUserRepository
    public MyUserDetailService(UserRepository myUserRepository) {
        this.userRepository = myUserRepository;
    }

    /**
     * Loads the user by username.
     * 
     * @param username the username to search for
     * @return the UserDetails object
     * @throws UsernameNotFoundException if the username is not found
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("user? " + username);
        Optional<User> myUserOptional = userRepository.findByUsername(username);
        if (myUserOptional.isPresent()) {
            User myUser = myUserOptional.get();
            System.out.println("user exists: " + username);
            System.out.println("user exists: " + myUser.getPassword());
            return org.springframework.security.core.userdetails.User.builder()
                    .username(myUser.getUsername())
                    .password(myUser.getPassword())
                    .roles("SIMPLE_USER")
                    .build();

        } else {
            System.out.println("no user");
            throw new UsernameNotFoundException(username);
        }
    }
}