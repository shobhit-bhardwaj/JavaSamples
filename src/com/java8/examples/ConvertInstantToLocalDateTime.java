package com.java8.examples;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class ConvertInstantToLocalDateTime {
	public static void main(String[] args) {
		Instant instant = Instant.now();
		LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);

		System.out.println("Instant - "+instant);
		System.out.println("LocalDateTime - "+dateTime);
	}
}