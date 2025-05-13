package com.example.bookstore.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bookstore.model.Book;

// https://www.freecodecamp.org/news/unit-testing-services-endpoints-and-repositories-in-spring-boot-4b7d9dc2b772/
@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {
	
	@Autowired
	TestEntityManager entityManager;
	
	@Autowired
	BookRepository bookRepository;
	
	@Test
	public void saveBookTest() {
		
		Book book = new Book();
		book.setTitle("The Bible");
		book.setAuthor("Many");
		book.setIsbn("00000");
		book.setPrice(10d);
		book.setStockQuantity(10);
		book = entityManager.persistAndFlush(book);
		
		assertThat(bookRepository.findById(book.getId()).get()).isEqualTo(book);
	}
	
}
