package com.coreJava.string;

public class MaximumOccuringCharacter {
	public static void main(String[] args) {
		String input = "hellointheworldofjava";

		int[] array = new int[256];
		char[] charArray = input.toCharArray();
		for(char ch : charArray) {
			int value = array[ch];
			value++;
			array[ch] = value;
		}

		int max = -1;
		char result = ' ';
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				result = (char) i;
			}
		}
		System.out.println(result);
	}
}