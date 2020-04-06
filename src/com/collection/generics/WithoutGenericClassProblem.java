package com.collection.generics;

public class WithoutGenericClassProblem {
	private static class SimpleClass {
		private Object value;

		public SimpleClass(Object value) {
			this.value = value;
		}

		public Object getValue() {
			return value;
		}
	}

	public static void main(String[] args) {
		SimpleClass integerObject = new SimpleClass(15);
		SimpleClass stringObject = new SimpleClass("String Value");

		integerObject = stringObject;	//	Doesn't Make Sence but Code will Compile

		//String value = stringObject.getValue();	//	Make Sence but Code won't Compile
	}
}