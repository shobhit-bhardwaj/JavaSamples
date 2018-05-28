package com.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CombineLambdaFunctionalInterfaceMethodReference {
	static class Employ {
		private int id;
		private String name;

		public Employ() {
		}

		public Employ(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "Employ [id=" + id + ", name=" + name + "]";
		}
	}

	public static void main(String[] args) {
		List<Employ> employs = Arrays.asList(
				new Employ(101, "Shobhit"),
				new Employ(102, "Ravi"),
				new Employ(103, "Rajesh"));

		performAction(employs, employ -> employ.name.startsWith("R"), System.out::println);
	}

	private static void performAction(List<Employ> employs, Predicate<Employ> predicate, Consumer<Employ> consumer) {
		employs.stream().filter(predicate).forEach(consumer);
	}
}