package com.java8.parallel.stream.employee;

import java.util.List;

import com.java8.parallel.stream.employee.dao.EmployeeDatabase;
import com.java8.parallel.stream.employee.model.Employee;

public class EmployeeAverageTest {

	public static void main(String[] args) {
		Long startTime, endTime;

		// 1. get all employees
		List<Employee> employees = EmployeeDatabase.getAllEmployees();

		// 2. normal stream code
		startTime = System.currentTimeMillis();
		double salaryWithStream = employees.stream()
				.map(e -> e.getSalary())
				.mapToDouble(i -> i)
				.average()
				.getAsDouble();
		endTime = System.currentTimeMillis();
		System.out.println("Normal stream execution time : " + (endTime - startTime) + "ms : Avg salary : " + salaryWithStream);
		// O/P: Normal stream execution time : 34ms : Avg salary : 7000.0

		System.out.println("----------------------------------------------------------------------");
		
		//3. parallel stream code
		startTime = System.currentTimeMillis();
		double salaryWithParallelStream = employees.stream()
				.parallel()
				.map(Employee::getSalary)
				.mapToDouble(i -> i)
				.average()
				.getAsDouble();
		endTime = System.currentTimeMillis();
		System.out.println("Parallel stream execution time : " + (endTime - startTime) + "ms : Avg salary : " + salaryWithParallelStream);
		// O/P: Parallel stream execution time : 10ms : Avg salary : 7000.0
	}
}
