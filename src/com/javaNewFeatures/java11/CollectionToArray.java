package com.javaNewFeatures.java11;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray {
	public static void main(String[] args) {
		List<String> nameList = List.of("Shobhit", "Ravi", "Rajesh", "Akash", "Arpit");
		System.out.println("nameList - " + nameList);

		String[] nameString = nameList.toArray(String[] :: new);
		System.out.println("nameString - " + Arrays.toString(nameString));
	}
}