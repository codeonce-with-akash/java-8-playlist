package com.java8.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.java8.dao.BookDaoImpl;
import com.java8.dao.IBookDao;
import com.java8.model.Book;

public class BookServiceImpl implements IBookService {

	IBookDao bookDao = null;
	
	@Override
	public List<Book> findAllBooksWithoutSorting() {
		bookDao = new BookDaoImpl();
		return bookDao.findAllBooks();
	}
	
	@Override
	public List<Book> findAllBooksWithSorting() {
		bookDao = new BookDaoImpl();
		return bookDao.findAllBooks().stream().sorted((book1, book2) -> book1.getBookId().compareTo(book2.getBookId())).toList();
		
	}
	
	@Override
	public Book findBookHavingNthHighestPrice(int input) {
		List<Book> allBooks = bookDao.findAllBooks();
		if(input > allBooks.size())
			throw new IllegalArgumentException("input value > book list size, book size is: "+allBooks.size());
		else 
			return allBooks.stream()
					//.sorted((book1, book2) -> book2.getBookPrice().compareTo(book1.getBookPrice()))
					.sorted((book1, book2) -> (book1.getBookPrice() > book2.getBookPrice()) ? -1 : (book1.getBookPrice() < book2.getBookPrice()) ? 1 :0)
					.skip(input-1)
					.findFirst().get();
	}
	
}
