package com.collection.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveAllDuplicatesInList {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 8, 8, 9, 10, 10));
		System.out.println("Initial List - " + integers);

		integers = new ArrayList<>(new HashSet<Integer>(integers));

		System.out.println("Final List - " + integers);
	}
}