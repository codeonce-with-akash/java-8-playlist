package com.java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ForEachMethodPocTest {

	public static void main(String[] args) {

		//1. iterating list elements using forEach() method.
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);
		list.stream().forEach(t -> System.out.println(t));
		
		System.out.println("-----------------------");

		//2. iterating map elements using forEach() method.
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.forEach((key, value) -> System.out.println(key + " : "+ value));
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		System.out.println("Entry Set :: "+entrySet);	// [1=one, 2=two, 3=three, 4=four, 5=five]
		entrySet.stream().forEach(obj -> System.out.println(obj.getKey() + " : "+ obj.getValue()));
	}

}
