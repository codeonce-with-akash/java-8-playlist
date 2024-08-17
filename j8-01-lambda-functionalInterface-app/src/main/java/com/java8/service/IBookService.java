package com.java8.service;

import java.util.List;

import com.java8.model.Book;

public interface IBookService {
	List<Book> findAllBooksWithoutSorting();
	List<Book> findAllBooksWithSorting();
	Book findBookHavingNthHighestPrice(int input);
	Book findBookHavingNthHighestPages(int input);
}
