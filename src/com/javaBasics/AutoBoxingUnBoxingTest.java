package com.javaBasics;

public class AutoBoxingUnBoxingTest {
	public static void main(String[] args) {
		/*
		 * This statement is deprecated since version 9
		 */
		//Integer intObject = new Integer(10);

		/*
		 * AutoBoxing is the automatic conversion that java compiler makes between
		 * a primitive type and its corresponding object wrapper class.
		 */
		Integer intObject = Integer.valueOf(10);
		int intValue = intObject.intValue();
		intValue = intObject;	//	This is AutoBoxing
		System.out.println("Primitive int value - " + intValue);

		/*
		 * UnBoxing is the reverse process of Boxing. It converts an instance of a
		 * wrapper class to its corresponding primitive type.
		 */
		intValue = 20;
		intObject = intValue;	//	This is UnBoxing
		System.out.println("Wrapper Integer value - " + intObject);
	}
}