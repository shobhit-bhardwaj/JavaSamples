package com.javaNewFeatures.java9;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargsAnnonation {
	@SafeVarargs
	public static void display(List<String>... lists) {
		System.out.println(lists);
	}

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("AAA");
		strings.add("BBB");
		strings.add("CCC");

		display(strings);
	}
}