package com.java8.dao;

import java.util.Arrays;
import java.util.List;

import com.java8.model.Customer;

public class EkartDatabase {
	public static List<Customer> findAllCustomers() {
		return Arrays.asList(
				new Customer(101L, "AKASH", "akash@gmail.com", Arrays.asList(9552038513L,7774949414L)),
				new Customer(102L, "YASH", "yash@gmail.com", Arrays.asList(7552038513L,6374949414L)),
				new Customer(103L, "DATTA", "datta@gmail.com", Arrays.asList(9852038513L,9174949414L)),
				new Customer(104L, "SHUBHAM", "shubham@gmail.com", Arrays.asList(8952038513L,7374949414L)),
				new Customer(105L, "NITESH", "nitesh@gmail.com", Arrays.asList(7852038513L,8874949414L))
				);
	}
}
