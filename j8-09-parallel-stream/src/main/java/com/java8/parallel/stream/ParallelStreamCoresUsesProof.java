package com.java8.parallel.stream;

import java.util.stream.IntStream;

public class ParallelStreamCoresUsesProof {

	public static void main(String[] args) {
		
		//1. Plain stream thread names
		IntStream.range(1, 101).forEach(x -> {
			System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
		});
		
		System.out.println("------------------------");
		
		//2. Parallel stream thread names
		IntStream.range(1, 101).parallel().forEach(x -> {
			System.out.println("Thread : " + Thread.currentThread().getName() + " : " + x);
		});
	}

}
