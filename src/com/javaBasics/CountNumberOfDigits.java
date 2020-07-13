package com.javaBasics;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		int number = 10_00_000;
		int digits = (int) Math.floor(Math.log10(number)) + 1;
		System.out.println("Number of Digits in "+number+" is - "+digits);
	}
}