package com.javaNewFeatures.java11;

public class StringUtilities {
	public static void main(String[] args) {
		String line = null;

		line = "  ";
		System.out.println("isBlank - " + line.isBlank());

		line = "   abc def ghi   ";
		System.out.println("strip - " + line.strip());
		System.out.println("stripLeading - " + line.stripLeading());
		System.out.println("stripTrailing - " + line.stripTrailing());

		line = "String";
		String value = line.transform(s -> s.toUpperCase().substring(0, 2));
		System.out.println("transform - " + value);

		System.out.println();

		line = "Hello \n I am Shobhit Bhardwaj   \n  \n  I am Java Developer. ";
		line.lines()
			.map(s -> s.strip())
			.filter(s -> !s.isBlank())
			.forEach(System.out :: println);

		System.out.println();

		String text = "Hello Shobhit!\nThis is article for indent.";

		text = text.indent(5);
		System.out.println("indent(5) -");
		System.out.println(text);

		System.out.println("indent(-10) -");
		text = text.indent(-10);
		System.out.println(text);
	}
}