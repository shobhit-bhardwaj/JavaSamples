package com.java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIEnhancement {
	public static void main(String[] args) {
		//	takeWhile
		List<Integer> intList = Stream.of(1, 2, 3, 4, 5, 6, 7).takeWhile(i -> i%2==0).collect(Collectors.toList());
		System.out.println("takeWhile - " + intList);	//	Gives Empty List Because Predicate Terminate at the Beginning.

		intList = Stream.of(2, 2, 4, 6, 7, 8, 9).takeWhile(i -> i%2==0).collect(Collectors.toList());
		System.out.println("takeWhile - " + intList);

		//	dropWhile
		intList = Stream.of(2, 4, 6, 3, 4, 5, 6, 7).dropWhile(i -> i%2==0).collect(Collectors.toList());
		System.out.println("dropWhile - " + intList);

		//	iterate
		Stream.iterate(1,i -> i<=10, i -> i+1).forEach(System.out :: println);
	}
}