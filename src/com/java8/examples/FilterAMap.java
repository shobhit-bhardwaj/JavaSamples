package com.java8.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterAMap {
	public static void main(String[] args) {
		Map<Integer, String> fruitMap = new HashMap<>();
		fruitMap.put(1, "Apple");
		fruitMap.put(2, "Banana");
		fruitMap.put(3, "Mango");
		fruitMap.put(4, "Orange");
		fruitMap.put(5, "Peach");

		//	Get String from a Given Condition
		String favorite = fruitMap.entrySet().stream()
				.map(entry -> entry.getValue())
				.filter(value -> "Mango".equals(value))
				.collect(Collectors.joining());
		System.out.println("Favorite Fruit - "+favorite);
		System.out.println();

		//	Get Map from a Given Condition
		Map<Integer, String> shortMap = fruitMap.entrySet().stream()
				.filter(entry -> entry.getKey() <= 3)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println("Short Map - "+shortMap);
		System.out.println();

		//	Using Predicate
		String likedFruit = getFruit(fruitMap, value -> "Banana".equals(value));
		System.out.println("Liked Fruit - "+likedFruit);

		likedFruit = getFruit(fruitMap, value -> "Ornge".equals(value));
		System.out.println("Liked Fruit - "+likedFruit);
	}

	private static String getFruit(Map<Integer, String> map, Predicate<String> predicate) {
		String fruit = map.entrySet().stream()
				.map(entry -> entry.getValue())
				.filter(value -> predicate.test(value))
				.collect(Collectors.joining());

		return fruit;
	}
}