package com.java8.dao;

import java.util.Arrays;
import java.util.List;

import com.java8.model.Employee;

public class EmployeeDatabase {
	public static List<Employee> getAllEmployee(){
		return Arrays.asList(
					new Employee(101, "akash", "A", 90000.0),
					new Employee(102, "smith", "B", 60000.0),
					new Employee(103, "jhon", "A", 70000.0),
					new Employee(104, "joe", "C", 50000.0),
					new Employee(105, "sky", "A", 80000.0)
				);
	}
}
