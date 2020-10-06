package com.java8;

import java.util.Arrays;
import java.util.List;

public class StreamVsParallelStream {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		integers.stream().map(i -> {
		//integers.parallelStream().map(i -> {
			System.out.println("Step 1 - " + i);
			return i * 2;
		}).filter(i -> {
			System.out.println("Step 2 - " + i);
			return i % 2 == 0;
		}).forEach(System.out::println);
	}
}