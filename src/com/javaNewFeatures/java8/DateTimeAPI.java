package com.javaNewFeatures.java8;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPI {
	public static void main(String[] args) {

		//	Local Date Time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.getDayOfWeek());
		System.out.println(dateTime.getDayOfMonth()+"-"+dateTime.getMonth()+"-"+dateTime.getYear());
		System.out.println(dateTime.getHour()+":"+dateTime.getMinute()+":"+dateTime.getSecond());

		//	Local Date
		LocalDate date = LocalDate.of(2016, 01, 12);
		System.out.println(date);

		//	Local Time
		LocalTime time = LocalTime.of(23, 55, 58);
		System.out.println(time);

		//	Time Zone
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println("Current Zone - "+zoneId);

		//	Chrono Unit
		dateTime = LocalDateTime.now();
		System.out.println(dateTime.plus(1, ChronoUnit.MONTHS));

		//	Period
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.now().plus(2, ChronoUnit.MONTHS);
		System.out.println(Period.between(date1, date2));

		//	Duration
		LocalTime time1 = LocalTime.now();
		LocalTime time2 = LocalTime.now().plus(17, ChronoUnit.MINUTES);
		System.out.println(Duration.between(time1, time2));

		//	Temporal Adjuster
		date = LocalDate.now();
		LocalDate nextDate = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(nextDate);
	}
}