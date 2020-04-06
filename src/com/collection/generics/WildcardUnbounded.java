package com.collection.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardUnbounded {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));
		printList(integers);

		List<Double> doubles = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0));
		printList(doubles);
	}

	public static void printList(List<?> list) {
		System.out.println(list);
	}

	/*public static void printList(List list) {
		System.out.println(list);
	}*/
}