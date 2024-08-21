package com.java8.supplier;

import java.util.function.Supplier;

public class PreSupplierFunInterface {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hello, welcome to java-8";

		System.out.println(supplier.get());

	}
}
