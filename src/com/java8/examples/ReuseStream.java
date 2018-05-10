package com.java8.examples;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ReuseStream {
	public static void main(String[] args) {
		System.out.println("Print Data from Stream -");
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		stream.forEach(value -> System.out.print(value+"\t"));
		System.out.println();

		//	Again if we use Stream, it will throw :- java.lang.IllegalStateException
		//	stream.forEach(value -> System.out.print(value+"\t"));

		Supplier<Stream<Integer>> supplier = () -> Stream.of(1, 2, 3, 4, 5);
		System.out.println("Print Data from Supplier First Time -");
		supplier.get().forEach(value -> System.out.print(value+"\t"));
		System.out.println();

		System.out.println("Print Data from Supplier Second Time -");
		supplier.get().forEach(value -> System.out.print(value+"\t"));
	}
}