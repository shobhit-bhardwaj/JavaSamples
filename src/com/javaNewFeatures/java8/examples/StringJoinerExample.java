package com.javaNewFeatures.java8.examples;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {

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

	public static void main(String[] args) {
		//	Simple StringJoiner
		StringJoiner joiner = new StringJoiner(",");
		//StringJoiner joiner = new StringJoiner(",", "These Fruits - ", " Are My Favorites.");
		joiner.add("Orange");
		joiner.add("Banana");
		joiner.add("Mango");
		joiner.add("Apple");
		System.out.println("String Joiner Fruits - " + joiner.toString());

		System.out.println();

		//	String Join Method
		String date = String.join("-", "12", "03", "1988");
		System.out.println("My Birth Day - " + date);

		System.out.println();

		//	String Join on List
		List<String> employs = List.of("Shobhit", "Ravi", "Rajesh");
		String employNames = String.join(",", employs);
		System.out.println("Employ Names - " + employNames);

		System.out.println();

		//	Collection Joining
		List<Employ> employList = List.of(
				new Employ(101, "Shobhit"),
				new Employ(102, "Ravi"),
				new Employ(103, "Rajesh"));

		employNames = employList.stream()
				.map(employ -> employ.name)
				.collect(Collectors.joining(","));
		System.out.println("Employ Names - " + employNames);
	}
}