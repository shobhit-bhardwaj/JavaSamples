package com.javaBasics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateComparison {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

		LocalDate date1 = LocalDate.of(2015, 01, 01);
		LocalDate date2 = LocalDate.of(2015, 06, 01);

		System.out.println("Date 1 - " + formatter.format(date1));
		System.out.println("Date 2 - " + formatter.format(date2));
		System.out.println();

		System.out.println("Date 1 is After Date 2 - " + date1.isAfter(date2));
		System.out.println("Date 1 is Before Date 2 - " + date1.isBefore(date2));
		System.out.println("Date 1 is Equal Date 2 - " + date1.isEqual(date2));
		System.out.println();

		System.out.println("Date 1 Compare To Date 2 - " + date1.compareTo(date2));
	}
}