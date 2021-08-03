package com.javaNewFeatures.java8;

import java.util.Optional;

public class Java8Optional {
	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = null;

		Optional<String> opt1 = Optional.ofNullable(s1);
		Optional<String> opt2 = Optional.ofNullable(s2);

		System.out.println(Optional.ofNullable(s1).isPresent());
		//System.out.println(opt1.isPresent());

		System.out.println(Optional.ofNullable(s2).isPresent());
		//System.out.println(opt2.isPresent());

		Optional<String> result1 = opt1.map(String :: toUpperCase);
		result1.ifPresent(s -> System.out.println(s));

		Optional<String> result2 = opt2.map(String :: toUpperCase);
		result2.ifPresent(System.out :: println);

		System.out.println(opt1.orElse("Bye"));
		System.out.println(opt2.orElse("Not Null"));
	}
}