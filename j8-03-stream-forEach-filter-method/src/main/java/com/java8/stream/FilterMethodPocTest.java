package com.java8.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterMethodPocTest {

	public static void main(String[] args) {
		//1. filtering list elements
		List<String> list = Arrays.asList("Akash", "Datta", "Shubham", "AkshayKumar", "Saurabh", "Ankit");
		list.stream().filter(t -> t.startsWith("S")).forEach(t -> System.out.println(t));
		
		//2. filtering map elements
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "One not one");
		map.put(102, "One not two");
		map.put(103, "One not three");
		map.put(104, "One not four");
		map.put(105, "One not five");
		//map.forEach((key, value) -> System.out.println(key +" : "+value));
		map.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(t -> System.out.println(t));
	}

}
