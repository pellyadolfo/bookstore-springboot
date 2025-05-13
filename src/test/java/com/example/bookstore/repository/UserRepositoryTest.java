package com.example.bookstore.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bookstore.model.User;

// https://www.freecodecamp.org/news/unit-testing-services-endpoints-and-repositories-in-spring-boot-4b7d9dc2b772/
@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryTest {
	
	@Autowired
	TestEntityManager entityManager;
	
	@Autowired
	UserRepository userRepository;
	
	@Test
	public void saveUserTest() {
		
		User user = new User();
		user = entityManager.persistAndFlush(user);
		
		assertThat(userRepository.findById(user.getId()).get()).isEqualTo(user);
	}
	
}
