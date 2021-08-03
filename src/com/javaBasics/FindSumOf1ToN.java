package com.javaBasics;

import java.util.stream.IntStream;

public class FindSumOf1ToN {
	public static void main(String[] args) {
		IntStream intStream = IntStream.range(1, 11);

		int sum = intStream.reduce(0, (x, y) -> x + y);
		System.out.println("Sum in Range - " + sum);
	}
}