package com.javaBasics;

import java.util.List;
import java.util.Optional;

public class OptionalFindBook {
	private static final List<String> books = List.of("Effective Java", "Java Made Easy", "Core Java Basics");

	private static String getBook(String letter) {
		Optional<String> bookFound = books.stream().filter(book -> book.startsWith(letter)).findFirst();

		//return bookFound.isPresent() ? bookFound.get() : "Book Not Found";
		return bookFound.orElse("Book Not Found");
	}

	public static void main(String[] args) {
		String book = getBook("J");
		System.out.println(book);
	}
}