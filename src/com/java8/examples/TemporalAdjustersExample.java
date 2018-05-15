package com.java8.examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		LocalDate date = LocalDate.of(2018, 02, 15);
		System.out.println("LocalDateTime - "+formatter.format(date));
		System.out.println();

		LocalDate temporalDate = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First Day of Month - "+formatter.format(temporalDate));

		temporalDate = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last Day of Month - "+formatter.format(temporalDate));

		temporalDate = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("Next Monday - "+formatter.format(temporalDate));
	}
}