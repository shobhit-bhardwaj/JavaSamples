package com.javaNewFeatures.java11;

import java.util.List;

/*
 * 1. Java compiler infers the type of the variable at compile time.
 * 2. Introduced in java 10.
 * 3. You can add final if you want.
 * 4. var can also be use in loops.
 * 5. We cannot assign null value in var.
 * 6. var is NOT a keyword. var var = 10; It is correct statement.
 */
public class TypeInferences {
	public static void main(String[] args) {
		List<String> admin = List.of("Shobhit", "Ravi");
		List<String> users = List.of("Rajesh");

		//List<List<String>> allUsers = List.of(admin, users);
		var allUsers = List.of(admin, users);
		allUsers.stream().forEach(System.out :: println);

		final var PI = 3.14;
		//var value = null;		//	Compilation Error
		var var = 10;
	}
}