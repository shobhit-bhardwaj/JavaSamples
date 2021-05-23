package com.java8;

import java.util.List;
import java.util.function.Predicate;

class PredicateImpl implements Predicate<Integer> {
	@Override
	public boolean test(Integer value) {
		if(value%2 == 0)
			return true;

		return false;
	}
}

public class FunctionalInterfacePredicate {
	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 2, 3, 4, 5);

		Predicate<Integer> predicate = new PredicateImpl();
		System.out.println("Predicate test for value 9 - " + predicate.test(9));
		System.out.println();

		for(int i : integers) {
			System.out.print("Predicate test for value " + i + " - ");

			if(predicate.test(i))
				System.out.println("Passed - " + i);
			else
				System.out.println("Failed - " + i);
		}

		System.out.println();

		//integers.stream().filter(predicate).forEach(value -> System.out.println("value - " + value));
		integers.stream().filter(value -> value%2==0).forEach(value -> System.out.println("value - " + value));
	}
}