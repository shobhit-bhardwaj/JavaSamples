package com.javaBasics;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadAFileLineByLine {
	public static void main(String[] args) {
		String fileName = "mytxt.txt";

		//	Iterate Stream of Lines
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream.forEach(System.out :: println);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println();

		//	Create List of Lines
		List<String> lines = null;
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			lines = stream.collect(Collectors.toList());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Create List of Lines - " + lines);
	}
}