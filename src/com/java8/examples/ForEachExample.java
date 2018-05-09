package com.java8.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachExample {
	public static void main(String[] args) {
		Map<Integer, String> employMap = new HashMap<>();
		employMap.put(101, "Shobhit");
		employMap.put(102, "Ravi");
		employMap.put(103, "Rajesh");

		System.out.println("Map Iteration with forEach");
		employMap.forEach( (key, value) -> System.out.println("Employ :- Id - "+key+" | Name - "+value));
		System.out.println();

		List<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Node");
		languages.add("Angular");
		languages.add("React");

		System.out.println("List Iteration with forEach");
		languages.forEach( value -> System.out.println(value));
	}
}