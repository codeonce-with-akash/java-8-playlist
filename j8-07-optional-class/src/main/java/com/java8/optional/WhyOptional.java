package com.java8.optional;

import java.util.Optional;

import com.java8.optional.model.Customer;

public class WhyOptional {
	public static void main(String[] args) {
		Customer customer = new Customer(101, "AKASH", "akash@gmail.com");
		//System.out.println(customer.getEmail());
		
		Customer newCustomer = new Customer(102, "SMITH", null);
		//String email = newCustomer.getEmail();
		//System.out.println(email.toUpperCase());
		
		/**	There are 3 ways to create Optional class object	**/
		//1. empty()
		//2. of()
		//3. ofNullable()
		
		//1. Create Optional class object using empty() method.
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		//System.out.println(emptyOptional.get());	// java.util.NoSuchElementException: No value present
		
		//2. Create Optional class object using of() method
		//Optional<String> ofOptional = Optional.of(newCustomer.getEmail());	// in case of null value: java.lang.NullPointerException
		//System.out.println(ofOptional.get());
		
		//3. Create Optional class object using ofNullable() method
		Optional<String> ofNullableOptional = Optional.ofNullable(newCustomer.getEmail());	// in case of null value: it returns empty Optional class object
		System.out.println(ofNullableOptional.get());	// if we are trying to get the value from empty Optional class object then we get: java.util.NoSuchElementException: No value present. 
		
		//handling exception if provided value is null
		String result = Optional.ofNullable(customer.getEmail()).orElseThrow(() -> new IllegalArgumentException("EMAIL NOT FOUND!"));
		System.out.println(result);
	}
}
