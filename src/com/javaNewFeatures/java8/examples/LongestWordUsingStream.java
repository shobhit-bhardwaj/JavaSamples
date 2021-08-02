package com.javaNewFeatures.java8.examples;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordUsingStream {
	public static void main(String[] args) {
		String line = "Hello my name is Shobhit and I am an Engineer";

		String longestWord = Arrays
				.stream(line.split(" "))
				.max(Comparator.comparingInt(String :: length))
				.orElse(null);

		System.out.println("Longest Word - " + longestWord);
	}
}