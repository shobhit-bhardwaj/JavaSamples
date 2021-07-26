package com.collection.generics;

interface Simple <T> {
	public void display(T value);
}

class SimpleImpl implements Simple<Number> {
	@Override
	public void display(Number value) {
		System.out.println("SimpleImpl display - " + value);
	}
}

class SimpleClass <T> {
	private T value;

	public SimpleClass(T value) {
		this.value = value;
	}

	public void display() {
		System.out.println("SimpleClass display - " + value);
	}
}

class SimpleMethod {
	public <T> void display(T value) {
		System.out.println("SimpleMethod display - " + value);
	}

	public <T extends Number> void displayNumber(T value) {
		System.out.println("SimpleMethod displayNumber - " + value.intValue());
	}
}

public class BasicGenericClassInterfaceMethod {
	public static void main(String[] args) {
		SimpleImpl simpleImpl = new SimpleImpl();
		simpleImpl.display(125);

		SimpleClass<Integer> simpleClass = new SimpleClass<>(125);
		simpleClass.display();

		SimpleMethod simpleMethod = new SimpleMethod();
		simpleMethod.display(125);
		simpleMethod.display("Hello");

		simpleMethod.displayNumber(123);
		//simpleMethod.displayNumber("Hello");
	}
}