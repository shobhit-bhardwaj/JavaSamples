package com.dataStructure.string;

import java.util.stream.IntStream;

public class PalindromString {
	public static void main(String[] args) {
		String str = "helloolleh";

		boolean palindrom = IntStream
				.range(0, str.length()/2)
				.noneMatch(index -> str.charAt(index) != str.charAt(str.length()-index-1));

		System.out.println("String Palindrom - " + palindrom);
	}
}