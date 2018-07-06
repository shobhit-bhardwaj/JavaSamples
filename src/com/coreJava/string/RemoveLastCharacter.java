package com.coreJava.string;

import java.util.Optional;

public class RemoveLastCharacter {
	public static void main(String[] args) {
		String str = "hello world";
		str = Optional.ofNullable(str)
				.filter(s -> s.length() != 0)
				.map(s -> s.substring(0, s.length()-1))
				.orElse(str);

		System.out.println(str);
	}
}