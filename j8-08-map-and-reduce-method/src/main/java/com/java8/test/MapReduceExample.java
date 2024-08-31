package com.java8.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.java8.dao.EmployeeDatabase;

public class MapReduceExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
		List<String> words = Arrays.asList("MUMBAI", "PUNE", "KHAMGAON", "NAGPUR", "AHAMADNAGAR", "CH. SAMBHAJINAGAR");

		// 1. traditional approach to get sum of all the list of integer elements
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		System.out.println("sum using traditional approach :: " + sum);

		// 2. using stream API sum() of method
		int sumOf = numbers.stream().mapToInt(i -> i).sum();
		System.out.println("sum using sum() method :: " + sumOf);

		// 3. using reduce(identity, accumulator)
		Integer reduceSum = numbers.stream().reduce(0, (o1, o2) -> o1 + o2);
		System.out.println("sum using reduce(identity, accumulator) :: " + reduceSum);

		// 4. using method reference
		Optional<Integer> reduceSumWithMethodRef = numbers.stream().reduce(Integer::sum);
		System.out.println("sum using method reference :: " + reduceSumWithMethodRef.get());

		// 5. perform multiplication of all list elements
		Integer mulResult = numbers.stream().reduce(1, (n1, n2) -> (n1 * n2));
		System.out.println("multiplication :: " + mulResult);
		
		// 6. find max number from given list
		Integer maxNum = numbers.stream().reduce(0, (o1, o2) -> o1 > o2 ? o1 : o2);
		//Integer maxNum = numbers.stream().reduce((o1, o2) -> o1 > o2 ? o1 : o2).get();
		System.out.println("max number :: " + maxNum);
		
		// 7. find max number using method reference
		Integer maxNumUsingMethodRef = numbers.stream().reduce(Integer::max).get();
		System.out.println("max number using method reference :: " + maxNumUsingMethodRef);
		
		// 8. large string from given string list
		String largeStr = words.stream()
		.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
		.get();
		System.out.println("large string :: " + largeStr);
		
		// 9. calculate average
		double average = EmployeeDatabase.getAllEmployee().stream()
		.filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
		.map(emp -> emp.getSal())
		.mapToDouble(i -> i)
		.average()
		.getAsDouble();
		System.out.println("Average salary :: " + average);
		
		// 10. calculate sum of salary
		double sumSalray = EmployeeDatabase.getAllEmployee().stream()
		.filter(emp -> emp.getGrade().equalsIgnoreCase("A"))
		.map(emp -> emp.getSal())
		.mapToDouble(i->i)
		.sum();
		System.out.println("sum of salary :: " + sumSalray);
	}

}
