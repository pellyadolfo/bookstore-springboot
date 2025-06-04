package com.example.bookstore.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.bookstore.model.Order;

// https://www.freecodecamp.org/news/unit-testing-services-endpoints-and-repositories-in-spring-boot-4b7d9dc2b772/
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class OrderRepositoryTest {
	
	@Autowired
	TestEntityManager entityManager;
	
	@Autowired
	OrderRepository orderRepository;
	
	@Test
	public void saveOrderTest() {
		
		Order order = new Order();
		order = entityManager.persistAndFlush(order);
		
		assertThat(orderRepository.findById(order.getId()).get()).isEqualTo(order);
	}
	
}
