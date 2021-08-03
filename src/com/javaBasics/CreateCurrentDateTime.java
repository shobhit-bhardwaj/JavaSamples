package com.javaNewFeatures.java8.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreateCurrentDateTime {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Local Date Time - " + formatter.format(dateTime));

		formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.now();
		System.out.println("Local Date - " + formatter.format(date));
	}
}