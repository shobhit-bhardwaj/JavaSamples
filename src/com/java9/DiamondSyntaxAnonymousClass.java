package com.java9;

abstract class Template<T> {
	abstract void show(T t);
}

public class DiamondSyntaxAnonymousClass {
	public static void main(String[] args) {
		Template<String> stringTemplate = new Template<>() {
			@Override
			void show(String value) {
				System.out.println(value);
			}
		};

		stringTemplate.show("Hello World");
	}
}