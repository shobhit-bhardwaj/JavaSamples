package com.java8.examples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AddDaysToLocalDate {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss");
		LocalDateTime dateTime = LocalDateTime.of(2018, 02, 20, 12, 30, 00);
		System.out.println("LocalDateTime - "+formatter.format(dateTime));

		dateTime = dateTime.plusMonths(3);
		System.out.println("Add 3 Months - "+formatter.format(dateTime));

		dateTime = dateTime.plus(20, ChronoUnit.DAYS);
		System.out.println("Add 20 Days - "+formatter.format(dateTime));
	}
}