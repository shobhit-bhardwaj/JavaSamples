package com.javaNewFeatures.java8.examples;

import java.util.Arrays;
import java.util.stream.IntStream;

public class JoinMultipleArrays {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {6, 7};
		int[] array3 = {8, 9, 10};

		int[] result = IntStream
				.concat(Arrays.stream(array1), IntStream.concat(Arrays.stream(array2), Arrays.stream(array3)))
				.toArray();

		System.out.println("Result Array - " + Arrays.toString(result));
	}
}