package com.java8.stream.employee.service;

import java.util.List;
import java.util.stream.Collectors;

import com.java8.stream.employee.dao.EmployeeDao;
import com.java8.stream.employee.model.Employee;

public class EmployeeServiceImpl {
	public List<Employee> taxEvaluator(String input) {
		EmployeeDao dao = new EmployeeDao();
		return input.equalsIgnoreCase("tax")
				? dao.getAllEmployees().stream().filter(emp -> emp.getSal() > 500000).collect(Collectors.toList())
				: dao.getAllEmployees().stream().filter(emp -> emp.getSal() <= 500000).collect(Collectors.toList());

	}
}
