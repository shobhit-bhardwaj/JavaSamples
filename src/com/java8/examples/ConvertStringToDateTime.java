package com.java8.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConvertStringToDateTime {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.parse("10-Mar-2015 17:00:00", formatter);
		System.out.println("Local Date Time (Parse From String) - "+dateTime);

		formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDate date = LocalDate.parse("15-Jul-2017", formatter);
		System.out.println("Local Date (Parse From String) - "+date);
	}
}