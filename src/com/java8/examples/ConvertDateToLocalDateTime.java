package com.java8.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertDateToLocalDateTime {
	public static void main(String[] args) {
		Date date = new Date();
		LocalDateTime dateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println("Date - "+date);
		System.out.println("Date to LocalDateTime - "+dateTime);
		System.out.println();

		dateTime = LocalDateTime.of(2018, 02, 20, 12, 00, 00);
		date = Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("LocalDateTime - "+dateTime);
		System.out.println("LocalDateTime to Date - "+date);
	}
}