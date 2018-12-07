package com.dataStructure.string;

public class SwapFirstAndLastCharOfWordInString {
	public static void main(String[] args) {
		String input = "this is a simple string";

		String[] inputArray = input.split(" ");
		String output = "";
		char[] chars = null;
		for(String string : inputArray) {
			chars = string.toCharArray();
			int length = chars.length;

			char temp = chars[0];
			chars[0] = chars[length-1];
			chars[length-1] = temp;

			output = output.concat(String.valueOf(chars)).concat(" ");
		}

		System.out.println(output);
	}
}