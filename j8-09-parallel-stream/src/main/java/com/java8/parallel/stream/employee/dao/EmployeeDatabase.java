package com.java8.parallel.stream.employee.dao;

import java.util.Arrays;
import java.util.List;

import com.java8.parallel.stream.employee.model.Employee;

public class EmployeeDatabase {
	public static List<Employee> getAllEmployees(){
		return Arrays.asList(
				new Employee(101, "Harry", 9000.0),
				new Employee(102, "Smith", 8000.0),
				new Employee(103, "John", 6000.0),
				new Employee(104, "Joe", 5000.0),
				new Employee(105, "Marry", 7000.0)
				);
	}
}
