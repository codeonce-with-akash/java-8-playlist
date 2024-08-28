package com.java8.test;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.dao.EkartDatabase;
import com.java8.model.Customer;

public class MapAndFlatMapTest {

	public static void main(String[] args) {

		//get all customers
		List<Customer> customers = EkartDatabase.findAllCustomers();
		
		//1.map()
		//convert >> List<Customer> to List<String>
		List<String> list = customers.stream()
				.map(emp -> emp.getCustEmail())
				.collect(Collectors.toList());
		System.out.println("mails:: "+list);
		
		//convert >> List<Customer> to List<List<Long>>
		List<List<Long>> list2 = customers.stream()
				.map(emp -> emp.getPhoneNumbers())
				.collect(Collectors.toList());
		System.out.println("phones:: "+list2); //[[9552038513, 7774949414], [7552038513, 6374949414], [9852038513, 9174949414], [8952038513, 7374949414], [7852038513, 8874949414]]
		
		//2.flatMap()
		//convert >> List<Customer> to List<Long>
		List<Long> list3 = customers.stream()
				.flatMap(emp -> emp.getPhoneNumbers().stream())
				.collect(Collectors.toList());
		System.out.println("phones:: "+list3); //[9552038513, 7774949414, 7552038513, 6374949414, 9852038513, 9174949414, 8952038513, 7374949414, 7852038513, 8874949414]
		
	}

}
