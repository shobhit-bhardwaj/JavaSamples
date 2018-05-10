package com.java8.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertStreamToList {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		List<Integer> integers = stream.collect(Collectors.toList());
		System.out.println("Integer List (Stream) - "+integers);

		IntStream intStream = IntStream.range(1, 11);
		integers = intStream.boxed().collect(Collectors.toList());
		System.out.println("Integer List (IntStream) - "+integers);
	}
}