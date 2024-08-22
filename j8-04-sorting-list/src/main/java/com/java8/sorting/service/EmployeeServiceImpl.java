package com.java8.sorting.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.sorting.dao.EmployeeDao;
import com.java8.sorting.model.Employee;

public class EmployeeServiceImpl {
	public static List<Employee> findAllEmployees() {
		
		List<Employee> employees = EmployeeDao.getAllEmployees();
		
		//return employees.stream().sorted((emp1, emp2) -> emp2.getSal().compareTo(emp1.getSal())).collect(Collectors.toList());
		//return employees.stream().sorted((emp1, emp2) -> emp1.getSal() > emp2.getSal()?-1:(emp1.getSal()<emp2.getSal())?1:0).collect(Collectors.toList());
		//return employees.stream().sorted(Comparator.comparing(emp -> emp.getName())).collect(Collectors.toList());
		//return employees.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());	//gives ASC order
		
		//Collections.sort(employees, (o1, o2) -> o2.getSal().intValue() - o1.getSal().intValue());
		return employees;
	}
}
