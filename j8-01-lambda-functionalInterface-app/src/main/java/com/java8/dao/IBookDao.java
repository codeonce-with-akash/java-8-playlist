package com.java8.dao;

import java.util.List;

import com.java8.model.Book;

public interface IBookDao {
	public List<Book> findAllBooks();
}
