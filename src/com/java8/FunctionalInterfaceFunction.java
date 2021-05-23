package com.java8;

import java.util.List;
import java.util.function.Function;

class FunctionImpl implements Function<Integer, Integer> {
	@Override
	public Integer apply(Integer input) {
		return input * 2;
	}
}

public class FunctionalInterfaceFunction {
	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 2, 3, 4, 5);

		Function<Integer, Integer> function = new FunctionImpl();
		System.out.println("Function apply for value 3 - " + function.apply(3));
		System.out.println();

		for(int i : integers) {
			System.out.println("Function apply for value " + i + " - " + function.apply(i));
		}

		System.out.println();

		//integers.stream().map(function).forEach(value -> System.out.println("value - " + value));
		integers.stream().map(value -> value*2).forEach(value -> System.out.println("value - " + value));
	}
}