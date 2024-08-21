package com.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PrePredicateFunInterface {

	public static void main(String[] args) {
		Predicate<String> predicate = t -> (t.length() > 5);
		System.out.println(predicate.test("AKASHH"));
		
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
		asList.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Even Nums :: " + t));
	}
}
