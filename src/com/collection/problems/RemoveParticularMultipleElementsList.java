package com.collection.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveParticularMultipleElementsList {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(Arrays.asList(1, null, 2, null, 3, 3, 4, 5, 5, 6, 7));
		System.out.println("Initial List - " + integers);

		List<Integer> removeElements = Arrays.asList(null, 3);
		System.out.println("Remove Element - " + removeElements);

		while(integers.removeAll(Arrays.asList(null, 3)));

		System.out.println("Final List - " + integers);
	}
}