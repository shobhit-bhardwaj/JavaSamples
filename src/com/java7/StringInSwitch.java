package com.java7;

public class StringInSwitch {
	public static void main(String[] args) {
		String myChoice = "JAVA";

		switch (myChoice) {
		case "JAVA":
		case "CPP":
		case "C#":
			System.out.println("The Choice is OOP Language");
			break;
		default:
			System.out.println("The Choice is Not OOP Language");
			break;
		}
	}
}