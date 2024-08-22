package com.java8.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 30, 20, 40, 60, 50);

		// A. using Collections.sort() method
		Collections.sort(list);
		System.out.println("ASC :: " + list);

		/* Option: 2 create anonymous inner class
		Collections.sort(list, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		*/

		// Option: 3 pass lambda expression
		Collections.sort(list, (num1, num2) -> num2.compareTo(num1));
		System.out.println("DESC :: " + list);

		System.out.println("-------------------------------");

		// B. using stream API

		/* Option: 1 using anonymous inner class
		list.stream().sorted(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			};
		}).forEach(t -> System.out.println(t));;
		*/

		/* Option: 2 using reverseOrder()
		 list.stream().sorted(Comparator.reverseOrder()).forEach(t ->
		 System.out.println(t));
		/*
		
		/* Option: 3 using compareTo() method
		 list.stream().sorted((o1,o2) -> o2.compareTo(o1)).forEach(t ->
		 System.out.println(t));
		*/

		// Option: 4 using ternary expression
		list.stream().sorted((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0).forEach(t -> System.out.println(t));

	}
}

/* Option: 1 create MyComparator class and pass this class object to sort() as comparator obj
class MyComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
}
*/