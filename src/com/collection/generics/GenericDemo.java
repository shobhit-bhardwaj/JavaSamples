package com.collection.generics;

class GenericClass<T> {
	private T value;

	public GenericClass(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
}

public class GenericDemo {
	public static void main(String[] args) {
		GenericClass<Integer> intObject = new GenericClass<Integer>(15);
		GenericClass<String> stringObject = new GenericClass<String>("String Value");

		//intObject = stringObject;		//	Doesn't Make Sense so Won't Compile

		int intValue = intObject.getValue();
		System.out.println("Integer Value - "+intValue);

		String value = stringObject.getValue();
		System.out.println("String Value - "+value);
	}
}