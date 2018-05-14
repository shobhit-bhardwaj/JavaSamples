package com.java8.examples;

import java.sql.Timestamp;
import java.time.Instant;

public class CreateCurrentTimeStamp {
	public static void main(String[] args) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Instant instant = timestamp.toInstant();

		System.out.println("Instant - "+instant);
		System.out.println("To Epoch - "+instant.toEpochMilli());
		timestamp = Timestamp.from(instant);
		System.out.println("Get Time from Timestamp - "+timestamp.getTime());
	}
}