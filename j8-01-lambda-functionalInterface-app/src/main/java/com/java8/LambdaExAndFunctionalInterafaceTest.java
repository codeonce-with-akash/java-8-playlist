package com.java8;

import java.util.List;

import com.java8.functional.interf.Calculator;
import com.java8.model.Book;
import com.java8.service.BookServiceImpl;
import com.java8.service.IBookService;

public class LambdaExAndFunctionalInterafaceTest {

	public static void main(String[] args) {

		// Calculator cal = () -> System.out.println("Calculater switched on!");

		// Calculator cal = (num1, num2) -> System.out.println("Sum : "+ (num1 + num2));

		/*
		 Calculator cal = (num1, num2) -> {
			if(num1 < 0 && num2 < 0)
				throw new IllegalArgumentException("Both numbers should not be less than 0");
			else
				return num1-num2;
			};
		int substraction = cal.substraction(20, 10);
		System.out.println("Substraction : " + substraction);
		*/

		IBookService bookService = new BookServiceImpl();
		List<Book> allBooksWithoutSorting = bookService.findAllBooksWithoutSorting();
		System.out.println("All books details without sorting : ");
		// allBooksWithoutSorting.forEach(System.out::println);

		System.out.println("---------------------------------------");

		List<Book> allBooksWithSorting = bookService.findAllBooksWithSorting();
		System.out.println("All books details with sorting based on id : ");
		allBooksWithSorting.forEach(System.out::println);

		System.out.println("---------------------------------------");

		Book book = null;
		try {
			book = bookService.findBookHavingNthHighestPrice(7);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("2nd highest book price details is : " + book);
	}
}
