package com.java8.examples;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMapToList {
	public static void main(String[] args) {
		Map<Integer, String> fruitMap = new HashMap<>();
		fruitMap.put(1, "Apple");
		fruitMap.put(2, "Banana");
		fruitMap.put(3, "Mango");
		fruitMap.put(4, "Orange");
		fruitMap.put(5, "Peach");

		//	Create List of Map Keys
		List<Integer> keyList = fruitMap.keySet().stream()
				.collect(Collectors.toList());
		System.out.println("List of Map Keys - "+keyList);

		//	Create List of Map Keys
		List<String> valueList = fruitMap.values().stream()
				.collect(Collectors.toList());
		System.out.println("List of Map Values - "+valueList);
	}
}