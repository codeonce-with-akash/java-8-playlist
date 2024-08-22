package com.java8.stream.employee.test;

import com.java8.stream.employee.service.EmployeeServiceImpl;

public class EmployeeTaxEvaluator {

	public static void main(String[] args) {
		EmployeeServiceImpl service = new EmployeeServiceImpl();
		service.taxEvaluator("tax").stream()
				.sorted((emp1, emp2) -> emp1.getSal() > emp2.getSal() ? -1 : (emp1.getSal() < emp2.getSal() ? 1 : 0))
				.forEach(emp -> System.out.println(emp));
	}

}
