package com.java8.dao;

import java.util.Arrays;
import java.util.List;

import com.java8.model.Book;

public class BookDaoImpl implements IBookDao {

	@Override
	public List<Book> findAllBooks() {
		return Arrays.asList(
				new Book(101L, "Effective Java", 450.00, 460L),
				new Book(107L, "AWS", 1500.00, 420L),
				new Book(102L, "Servlets", 150.00, 200L),
				new Book(104L, "Spring", 500.00, 3000L),
				new Book(106L, "Microservices", 2000.00, 500L),
				new Book(105L, "Spring Boot", 600.00, 360L),
				new Book(103L, "JSP", 100.00, 150L)
				);
	}
	
}
