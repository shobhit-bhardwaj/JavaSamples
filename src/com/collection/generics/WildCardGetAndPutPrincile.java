package com.collection.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardGetAndPutPrincile {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(1);

		/*
		 * Get and Put Principle
		 * 
		 * Use an extends wildcard to get values.
		 * Use a super wildcard to put values.
		 * 
		 * Example -
		 * Collections.copy(dest, src);
		 * List<? super T> dest
		 * List<? extends T> src
		 * 
		 */

		List<? extends Integer> extendsList = integers;
		//extendsList.add(2);
		Integer value1 = extendsList.get(0);

		List<? super Integer> superList = integers;
		superList.add(2);
		//Integer value2 = superList.get(0);
	}
}