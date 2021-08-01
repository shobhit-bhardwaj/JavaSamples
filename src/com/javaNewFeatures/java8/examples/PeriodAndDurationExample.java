package com.javaNewFeatures.java8.examples;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationExample {
	public static void main(String[] args) {
		// Duration Example
		Duration duration = Duration.ofHours(1);
		System.out.println("Duration 1 Hour - " + duration.getSeconds());

		duration = Duration.of(20, ChronoUnit.MINUTES);
		System.out.println("Duration 20 Minuts - " + duration.getSeconds());
		System.out.println();

		LocalDateTime dateTime1 = LocalDateTime.of(2015, 6, 10, 12, 00, 00);
		LocalDateTime dateTime2 = LocalDateTime.of(2015, 8, 8, 14, 00, 00);
		System.out.println("Date 1 - " + dateTime1);
		System.out.println("Date 2 - " + dateTime2);

		duration = Duration.between(dateTime1, dateTime2);
		System.out.println("Difference Between Dates - " + duration.get(ChronoUnit.SECONDS));
		System.out.println();

		// Period Example
		Period period = Period.ofDays(18);
		System.out.println("Period of " + period.getDays() + " Days");

		period = Period.of(3, 4, 23);
		System.out.println("Period of - " + period.getYears() + " Years, " + period.getMonths() + " Months, " + period.getDays() + " Days");

		LocalDate date1 = LocalDate.of(2013, 6, 22);
		LocalDate date2 = LocalDate.of(2017, 11, 6);
		System.out.println("Date 1 - " + date1);
		System.out.println("Date 2 - " + date2);

		period = Period.between(date1, date2);
		System.out.println("Difference Between Dates - " + period.getYears() + " Years, " + period.getMonths() + " Months, " + period.getDays() + " Days");
		System.out.println();

		// ChronoUnit Example
		long yearDiff = ChronoUnit.YEARS.between(dateTime1, dateTime2);
		long monthDiff = ChronoUnit.MONTHS.between(dateTime1, dateTime2);
		long dayDiff = ChronoUnit.DAYS.between(dateTime1, dateTime2);
		long hourDiff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
		long minuteDiff = ChronoUnit.MINUTES.between(dateTime1, dateTime2);
		long secondDiff = ChronoUnit.SECONDS.between(dateTime1, dateTime2);

		System.out.println("Year Difference - " + yearDiff);
		System.out.println("Month Difference - " + monthDiff);
		System.out.println("Day Difference - " + dayDiff);
		System.out.println("Hour Difference - " + hourDiff);
		System.out.println("Minute Difference - " + minuteDiff);
		System.out.println("Second Difference - " + secondDiff);
	}
}