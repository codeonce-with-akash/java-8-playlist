package com.java8.optional.stream;

import java.util.List;

import com.java8.optional.dao.EkartDatabase;
import com.java8.optional.model.Customer;

public class OptionalStreamCodeTest {
	
	public static String findCutomerByEmail(String email) {
		List<Customer> list = EkartDatabase.getAll();
		return list.stream()
				.filter(customer -> customer.getEmail().equalsIgnoreCase(email))
				.map(customer -> customer.getEmail().toUpperCase())
				.findAny()
				.orElseThrow(() -> new IllegalArgumentException("Email Not Found!"));
	}
	
	public static void main(String[] args) {
		String result = findCutomerByEmail("da@gmail.com");
		System.out.println(result);
	}

}
