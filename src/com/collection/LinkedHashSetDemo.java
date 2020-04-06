package com.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> integers = new LinkedHashSet<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.addAll(Arrays.asList(4, 5, 6, 7, 8));

		int size = integers.size();

		boolean contains = integers.contains(10);

		Object[] array = integers.toArray();

		integers.forEach(x -> System.out.print(x + "\t"));
		Iterator<Integer> iterator = integers.iterator();

		integers.remove(new Integer(3));
		integers.removeAll(Arrays.asList(4, 5));
		integers.removeIf(x -> x == 1);

		integers.clear();
	}
}