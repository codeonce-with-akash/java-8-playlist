package com.java8.sorting.test;

import com.java8.sorting.service.EmployeeServiceImpl;

public class EmployeeSortingTest {
	public static void main(String[] args) {
		EmployeeServiceImpl.findAllEmployees().forEach(t -> System.out.println(t));
	}
}
