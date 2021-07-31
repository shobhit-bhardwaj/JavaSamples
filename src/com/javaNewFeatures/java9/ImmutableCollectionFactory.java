package com.javaNewFeatures.java9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ImmutableCollectionFactory {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("asList - " + asList);
		asList.set(2, 7);
		System.out.println("asList After set at position 2 - " + asList);

		List<Integer> ofList = List.of(1, 2, 3, 4, 5);
		System.out.println("ofList - " + ofList);
		//	ofList.set(2, 7);		//	Gives java.lang.UnsupportedOperationException (Immutable Collection)

		Map<Integer, String> ofMap = Map.of(1, "AAA", 2, "BBB", 3, "CCC");
		System.out.println("ofMap - " + ofMap);
	}
}