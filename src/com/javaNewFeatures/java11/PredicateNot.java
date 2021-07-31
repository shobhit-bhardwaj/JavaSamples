package com.javaNewFeatures.java11;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {

	private static class CoreLogics {
		private static boolean evenCheck(int number) {
			return number%2 == 0;
		}
	}

	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		/*
		 * If we define any predicate functional interface, we can use its nagate()
		 * method to execute its reverse filter operation.
		 */

		Predicate<Integer> evenPredicate = val -> val%2 == 0;

		System.out.print("Predicate (even values) - ");
		integers.stream()
			.filter(evenPredicate)
			.forEach(val -> System.out.print(val + "\t"));

		System.out.println();

		System.out.print("!Predicate (odd values) - ");
		integers.stream()
			.filter(evenPredicate.negate())
			.forEach(val -> System.out.print(val + "\t"));

		System.out.println();

		/*
		 * If we have any different method for filter and it doesn't implements Predicate
		 * interface, we can use Predicate's not() static method which execute the reverse
		 * of the first method.
		 */

		System.out.print("Predicate (even values) - ");
		integers.stream()
			.filter(CoreLogics :: evenCheck)
			.forEach(val -> System.out.print(val + "\t"));

		System.out.println();

		System.out.print("!Predicate (odd values) - ");
		integers.stream()
			.filter(Predicate.not(CoreLogics :: evenCheck))
			.forEach(val -> System.out.print(val + "\t"));
	}
}
