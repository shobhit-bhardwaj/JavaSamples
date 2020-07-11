package com.java8;

@FunctionalInterface
public interface CustomFunctionalInterface {
	/*
	 * Only Single Abstract Method
	 * Another Abstract Method Will Cause Compile Time Error
	 */
	public abstract void abstractMethod();
	//public abstract void anotherAbstractMethod();

	/*
	 * Any Number of Static Methods
	 */
	public static void staticMethod1() {
		System.out.println("Static Method 1");
	}

	public static void staticMethod2() {
		System.out.println("Static Method 2");
	}

	/*
	 * Any Number of Default Methods
	 */
	public default void defaultMethod1() {
		System.out.println("Default Method 1");
		privateMethod1();
	}

	public default void defaultMethod2() {
		System.out.println("Default Method 2");
		privateMethod2();
	}

	/*
	 * Any Number of Private Methods
	 */
	private void privateMethod1() {
		System.out.println("Private Method 1");
	}

	private void privateMethod2() {
		System.out.println("Private Method 2");
	}
}