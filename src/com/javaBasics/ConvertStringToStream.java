package com.javaBasics;

public class ConvertStringToStream {
	public static void main(String[] args) {
		String name = "Shobhit Bhardwaj";

		name.chars()
				.mapToObj(x -> (char)x)
				.forEach(System.out :: println);
	}
}