package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class MapSortingTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(2, "two");
		map.put(1, "one");
		map.put(3, "three");
		map.put(5, "five");
		map.put(4, "four");
		map.put(7, "seven");
		map.put(6, "six");
		
		System.out.println(map);
		//1. using Collections sort() method
		ArrayList<Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
		for(Entry<Integer, String> entry:list) {
			System.out.println(entry.getKey() +" --- "+entry.getValue());
		}
		System.out.println("-------------------------");
		//2. using Map Entry compairingByKey() method
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//3. using Map Entry compairingByValue() method
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("-------------------------");
		
		//4. sorting based on particular field of Employee class 
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		
		
	}

}
