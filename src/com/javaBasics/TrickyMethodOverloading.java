package com.javaBasics;

public class TrickyMethodOverloading {
	public void testMethod(Object object) {
		System.out.println("Object - "+object);
	}

	public void testMethod(Exception exception) {
		System.out.println("Exception - "+exception);
	}

	public void testMethod(ArithmeticException exception) {
		System.out.println("ArithmeticException - "+exception);
	}

	public void testMethod(String string) {
		System.out.println("String - "+string);
	}

	public static void main(String[] args) {
		TrickyMethodOverloading tricky = new TrickyMethodOverloading();

		String string = null;
		tricky.testMethod(string);

		Object object = null;
		tricky.testMethod(object);

		Exception exception = null;
		tricky.testMethod(exception);

		//tricky.testMethod(null);	//	Wont Compile, If String Method is Uncommented.
									//	Print Last Sub Class's Method.
	}
}