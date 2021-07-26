package com.collection.generics;

import java.util.ArrayList;
import java.util.List;

/*
 * Get and Put Principle -
 * 
 * When dealing with collections, a common rule for selecting between upper or lower bounded wildcards is PECS.
 * PECS stands for Producer Extends, Consumer Super.
 * 
 * Use an extends wildcard to get values. Producer Extends
 * Use a super wildcard to add/put values. Consumer Super
 * 
 * Example -
 * Collections.copy(dest, src);
 * List<? super T> dest
 * List<? extends T> src
 * 
 */
public class WildcardGetAndPutPrinciple {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		integers.add(1);

		List<? extends Integer> extendsList = integers;
		//extendsList.add(2);
		Integer value1 = extendsList.get(0);

		List<? super Integer> superList = integers;
		superList.add(2);
		//Integer value2 = superList.get(0);
	}
}