package com.miscellaneous;

import java.util.stream.IntStream;

public class CheckEvenNumberWithoutModulus {
	public static void main(String[] args) {
		int number = 4;
		System.out.println(number +" is even - "+ ((number&1) == 0));
		System.out.println();

		IntStream.range(0, 25).filter(n -> (n&1) == 0).forEach(n -> System.out.println(n +" is even"));
	}
}