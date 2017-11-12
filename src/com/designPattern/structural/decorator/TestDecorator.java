package com.designPattern.structural.decorator;

public class TestDecorator {
	public static void main(String[] args) {
		Currency rupees = new Rupees();
		System.out.println(rupees.getDescription());

		Currency doller = new Doller();
		System.out.println(doller.getDescription());

		USDDecorator usDoller = new USDDecorator(doller);
		System.out.println(usDoller.getDescription());

		AUSDecorator ausDoller = new AUSDecorator(doller);
		System.out.println(ausDoller.getDescription());
	}
}