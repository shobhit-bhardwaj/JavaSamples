package com.collection.generics;

public class SolutionWithGenericClass {
	private static class SimpleClass<T> {
		private T value;

		public SimpleClass(T value) {
			this.value = value;
		}

		public T getValue() {
			return value;
		}
	}

	public static void main(String[] args) {
		SimpleClass<Integer> intObject = new SimpleClass<Integer>(15);
		SimpleClass<String> stringObject = new SimpleClass<String>("String Value");

		//intObject = stringObject;		//	Doesn't Make Sense so Won't Compile

		int intValue = intObject.getValue();
		System.out.println("Integer Value - "+intValue);

		String value = stringObject.getValue();
		System.out.println("String Value - "+value);
	}
}