package com.java8.examples;

import java.util.Arrays;
import java.util.List;

public class StreamFilterExample {
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
		//	Print Language Except PHP
		List<String> languages = Arrays.asList("Java", "PHP", "Node", "Angular", "Vue");
		languages.stream()
				.filter(language -> !"PHP".equals(language))
				.forEach(System.out::println);
		System.out.println();

		//	Find Element According to Filter Condition
		List<Employ> employs = Arrays.asList(
				new Employ(102, "Shobhit"),
				new Employ(101, "Ravi"),
				new Employ(103, "Rajesh"));

		Employ employResult = employs.stream()
				.filter(employ -> 102 == employ.id && "Shobhit".equals(employ.name))
				.findAny()
				.orElse(null);
		System.out.println("Employ Result - "+employResult);
	}
}