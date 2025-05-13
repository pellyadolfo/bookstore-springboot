package com.example.bookstore.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstore.dto.CartDTO;
import com.example.bookstore.dto.CartItemDTO;
import com.example.bookstore.service.CartService;

@RestController
@RequestMapping("/api/carts")
public class CartController {
    private final CartService cartService;
    
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }
    
    @GetMapping("/user/{userId}")
    public ResponseEntity<CartDTO> getCartByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(cartService.getCartByUserId(userId));
    }
    
    @PostMapping("/user/{userId}/items")
    public ResponseEntity<CartDTO> addItemToCart(
            @PathVariable Long userId,
            @RequestBody CartItemDTO cartItemDTO) {
        return ResponseEntity.ok(cartService.addItemToCart(userId, cartItemDTO));
    }
    
    @DeleteMapping("/user/{userId}/items/{bookId}")
    public ResponseEntity<Void> removeItemFromCart(
            @PathVariable Long userId,
            @PathVariable Long bookId) {
        cartService.removeItemFromCart(userId, bookId);
        return ResponseEntity.noContent().build();
    }
    
    @DeleteMapping("/user/{userId}/clear")
    public ResponseEntity<Void> clearCart(@PathVariable Long userId) {
        cartService.clearCart(userId);
        return ResponseEntity.noContent().build();
    }
}
