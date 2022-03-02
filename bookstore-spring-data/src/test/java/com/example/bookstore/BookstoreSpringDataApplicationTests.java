package com.example.bookstore;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(classes = BookstoreSpringDataApplication.class, webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
class BookstoreSpringDataApplicationTests {
	
}
