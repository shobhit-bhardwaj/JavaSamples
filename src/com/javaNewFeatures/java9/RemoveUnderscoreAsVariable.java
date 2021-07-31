package com.javaNewFeatures.java9;

public class RemoveUnderscoreAsVariable {
	public static void main(String[] args) {
		/*
		 * This code can be Compile in Java7 Without Error or Warning,
		 * In Java8, It Gives Only Warning,
		 * In Java9, This Code Wont Compile.
		 * 
		int _ = 10;
		System.out.println(_);
		*/

		int _a = 10;
		System.out.println(_a);
	}
}