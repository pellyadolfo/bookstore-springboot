package com.example.bookstore.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.bookstore.model.Cart;

// https://www.freecodecamp.org/news/unit-testing-services-endpoints-and-repositories-in-spring-boot-4b7d9dc2b772/
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class CartRepositoryTest {
	
	@Autowired
	TestEntityManager entityManager;
	
	@Autowired
	CartRepository cartRepository;
	
	@Test
	@Disabled
	public void saveCartTest() {
		
		Cart cart = new Cart();
		//cart.setUser(1L);
		cart = entityManager.persistAndFlush(cart);
		
		assertThat(cartRepository.findById(cart.getId()).get()).isEqualTo(cart);
	}
	
}
