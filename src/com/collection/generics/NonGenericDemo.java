package com.collection.generics;

class NonGenericClass {
	private Object value;

	public NonGenericClass(Object value) {
		this.value = value;
	}

	public Object getValue() {
		return value;
	}
}

public class NonGenericDemo {
	public static void main(String[] args) {
		NonGenericClass intObject = new NonGenericClass(15);
		NonGenericClass stringObject = new NonGenericClass("String Value");

		intObject = stringObject;	//	Doesn't Make Sence but Code will Compile

		//String value = stringObject.getValue();	//	Make Sence but Code won't Compile
	}
}