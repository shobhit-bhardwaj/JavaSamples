package com.javaBasics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNullValuesFromStream {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Mangoes", null, "Banana", null, "Orange", "Kiwi", null);
		System.out.println("Initial List (Contains NULL) - " + fruits);
		System.out.println();

		// Remove all NULL Values
		fruits = fruits.stream()
				.filter(value -> value != null)
				.collect(Collectors.toList());

		System.out.print("Remove all NULL Values - " + fruits);
	}
}