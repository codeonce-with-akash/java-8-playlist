package com.java8.parallel.stream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		Long startTime, endTime;
		
		//1. generate 1-100 numbers using sequential stream (plain stream)
		startTime = System.currentTimeMillis();
		IntStream.range(1, 101).forEach(n -> System.out.println(n));
		endTime = System.currentTimeMillis();
		System.out.println("Plain stream took time :: " + (endTime-startTime)+"ms");	//41ms
		
		System.out.println("-----------------------------------------------");
		
		//2. generate 1-100 numbers using parallel stream
		startTime = System.currentTimeMillis();
		IntStream.range(1, 101).parallel().forEach(System.out::println);
		endTime = System.currentTimeMillis();
		System.out.println("Parallel stream took time :: " + (endTime-startTime)+"ms");	//21ms
		
		
	}
}
