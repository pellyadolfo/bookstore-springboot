package com.example.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookstore.model.Order;
import com.example.bookstore.model.User;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}