package com.coreJava.string;

public class CountOccurrenceOfCharacter {
	public static void main(String[] args) {
		String str = "hello world";
		char letter = 'l';

		long count = str.chars().filter(ch -> ch == letter).count();

		System.out.println("Occurrence of Character - "+count);
	}
}