package com.javaNewFeatures.java8.examples;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertArrayToStream {
	public static void main(String[] args) {
		String[] fruits = {"Apple", "Mangoes", "Banana", "Orange", "Kiwi"};

		Stream<String> stream = Arrays.stream(fruits);
		//	Stream<String> stream = Stream.of(fruits);

		stream.forEach(System.out :: println);
	}
}