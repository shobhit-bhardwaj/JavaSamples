package com.javaBasics;

import java.util.Arrays;
import java.util.EnumSet;

enum Days {
	SUNDAY ("Sunday"),
	MONDAY ("Monday"),
	TUESDAY ("Tuesday"),
	WEDNESDAY ("Wednesday"),
	THURSDAY ("Thursday"),
	FRIDAY ("Friday"),
	SATURDAY ("Saturday");

	String name;

	private Days(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

public class EnumBasicTest {
	public static void main(String[] args) {
		EnumSet.allOf(Days.class).forEach(day -> System.out.print(day.getName() + "\t"));

		Arrays.asList(Days.values()).forEach(System.out :: println);
	}
}