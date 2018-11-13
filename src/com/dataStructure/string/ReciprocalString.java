package com.dataStructure.string;

public class ReciprocalString {
	public static void main(String[] args) {
		String input = "PRAKHAR";
		System.out.println("Input String - " + input);

		char[] chArray = input.toLowerCase().trim().toCharArray();
		StringBuilder output = new StringBuilder();
		for (char c : chArray) {
			char x = (char) ((int) 'a' + (int) 'z' - (int) c);
			output.append(x);
		}

		System.out.println("Reciprocal String - " + output.toString().toUpperCase());
	}
}