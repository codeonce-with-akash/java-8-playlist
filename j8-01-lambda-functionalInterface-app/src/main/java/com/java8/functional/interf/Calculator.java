package com.java8.functional.interf;

@FunctionalInterface
public interface Calculator {
	//1. without input 
	//void switchOn();
	
	//2. with input
	//void sum(int num1, int num2);
	
	//3. with input and return type
	int substraction(int num1, int num2);
}
