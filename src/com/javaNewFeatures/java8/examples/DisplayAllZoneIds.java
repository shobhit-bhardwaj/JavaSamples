package com.javaNewFeatures.java8.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class DisplayAllZoneIds {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();

		List<String> zoneList = new ArrayList<>(ZoneId.getAvailableZoneIds());
		zoneList.sort((name1, name2) -> name1.compareTo(name2));
		zoneList.stream()
				.forEach(zone -> System.out.println(zone + " - " + dateTime.atZone(ZoneId.of(zone)).getOffset().getId()));
	}
}