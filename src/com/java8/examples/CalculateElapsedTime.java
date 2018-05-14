package com.java8.examples;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class CalculateElapsedTime {
	public static void main(String[] args) throws Exception {
		long time1 = Instant.now().toEpochMilli();
		TimeUnit.SECONDS.sleep(3);
		long time2 = Instant.now().toEpochMilli();

		long difference = time2 - time1;
		System.out.println("Elapsed Time In Millis - "+difference);
	}
}