package com.javaBasics;

public class DivideAndMultiplyBy2 {
	public static void main(String[] args) {
		int number = 10;

		System.out.println("Number is - " + number);
		System.out.println("Multiply By 2 - " + (number << 1));
		System.out.println("Divide By 2 - " + (number >> 1));
	}
}