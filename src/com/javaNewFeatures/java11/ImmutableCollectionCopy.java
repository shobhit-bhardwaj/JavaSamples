package com.javaNewFeatures.java11;

import java.util.Arrays;
import java.util.List;

public class ImmutableCollectionCopy {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Shobhit", "Ravi", "Rajesh");
		names.set(1, "Akash");
		names.set(2, "Arpit");
		System.out.println("names - " + names);

		List<String> copy = List.copyOf(names);
		System.out.println("copy - " + copy);
		//copy.set(1, "Ravi");		//	Gives java.lang.UnsupportedOperationException (Immutable Collection)
	}
}