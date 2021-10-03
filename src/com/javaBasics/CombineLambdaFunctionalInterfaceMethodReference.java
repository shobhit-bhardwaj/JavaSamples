package com.javaBasics;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CombineLambdaFunctionalInterfaceMethodReference {

	private static class Employ {
		private int id;
		private String name;

		public Employ(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Employ [id=" + id + ", name=" + name + "]";
		}
	}

	private static boolean filter(Employ employ) {
		return employ.name.startsWith("S");
	}

	private static void print(Employ employ) {
		System.out.println(employ);
	}

	public static void main(String[] args) {
		List<Employ> employs = List.of(
				new Employ(101, "Shobhit"),
				new Employ(102, "Ravi"),
				new Employ(103, "Rajesh"));

		//	Approach 1
		performAction(employs, employ -> employ.name.startsWith("R"), System.out :: println);

		//	Approach 2
		performAction(employs, CombineLambdaFunctionalInterfaceMethodReference :: filter, CombineLambdaFunctionalInterfaceMethodReference :: print);

		//	Approach 3
		Predicate<Employ> predicate = employ -> employ.name.startsWith("S");
		Consumer<Employ> consumer = employ -> System.out.println(employ);
		performAction(employs, predicate, consumer);
	}

	private static void performAction(List<Employ> employs, Predicate<Employ> predicate, Consumer<Employ> consumer) {
		employs.stream().filter(predicate).forEach(consumer);
	}
}