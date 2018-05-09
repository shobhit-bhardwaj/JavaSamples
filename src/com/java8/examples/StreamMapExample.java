package com.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
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
		//	Change Case of List of String Elements
		List<String> upperAlpha = Arrays.asList("A", "B", "C", "D", "E");

		List<String> lowerAlpha = upperAlpha.stream()
				.map(value -> value.toLowerCase())
				.collect(Collectors.toList());

		System.out.println("Uper Alphabats - "+upperAlpha);
		System.out.println("Lower Alphabats - "+lowerAlpha);
		System.out.println();

		//	Create List of Upper Case Names from List of Employ Beans
		List<Employ> employs = Arrays.asList(
				new Employ(101, "Shobhit"),
				new Employ(102, "Ravi"),
				new Employ(103, "Rajesh"));

		List<String> names = employs.stream()
				.map(employ -> employ.name)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println("Name List - "+names);
	}
}