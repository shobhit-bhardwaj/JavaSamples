package com.collection.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveByIndexOrObject {
	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60 ,70 ,80 ,90, 100));
		System.out.println("Initial List - " + integers);

		int index = 3;
		Integer removeElement = integers.remove(index);
		System.out.println("Remove Element by Index - " + removeElement);
		System.out.println("Updated List by Removing Value at Index - " + integers);

		Integer value = Integer.valueOf(50);
		integers.remove(value);
		System.out.println("Updated List by Removing Value - " + integers);
	}
}