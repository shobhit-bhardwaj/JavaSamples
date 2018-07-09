package com.coreJava.string;

public class StringReverseUsingRecurrsion {
	private static void reverse(char[] chArray, int i) {
		if(i == chArray.length)
			return;

		reverse(chArray, i+1);
		System.out.print(chArray[i]);
		
	}

	public static void main(String[] args) {
		String str = "Hello World";
		reverse(str.toCharArray(), 0);
	}
}