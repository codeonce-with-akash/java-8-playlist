package com.java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PreConsumerFunInterface {

	public static void main(String[] args) {

		Consumer<String> consumer = (t) -> {
			System.out.println("Print :: " + t);
		};

		consumer.accept("AKASH HIWALE");
		
		List<Integer> asList = Arrays.asList(10, 20, 30, 40, 50);
		asList.forEach(num -> System.out.println(num));
	}

}
