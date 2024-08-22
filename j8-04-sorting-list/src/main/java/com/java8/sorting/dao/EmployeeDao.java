package com.java8.sorting.dao;

import java.util.Arrays;
import java.util.List;

import com.java8.sorting.model.Employee;

public class EmployeeDao {
	public static List<Employee> getAllEmployees(){
		return Arrays.asList(
				new Employee(101, "David", "Cricketer", 500000.0),
				new Employee(102, "ShahRukh", "Actor", 1000000.0),
				new Employee(103, "Arijit", "Singer", 600000.0),
				new Employee(104, "Messi", "Football", 900000.0),
				new Employee(105, "Chetan", "Writer", 400000.0),
				new Employee(106, "Mark", "Developer", 450000.0)
				);
		
	}
}
