package com.java8.optional.dao;

import java.util.Arrays;
import java.util.List;

import com.java8.optional.model.Customer;

public class EkartDatabase {
	public static List<Customer> getAll(){
		return Arrays.asList(
				new Customer(101, "AKASH", "ak@gmail.com"),
				new Customer(102, "SHUBHAM", "sh@gmail.com"),
				new Customer(103, "DATTA", "da@gmail.com"),
				new Customer(104, "RAHUL", "ra@gmail.com"),
				new Customer(105, "HARISH", "ha@gmail.com")
				);
	}
}
