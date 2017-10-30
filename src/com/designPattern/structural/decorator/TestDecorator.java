package com.designPattern.structural.decorator;

public class TestDecorator {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println();

		Car luxuryCar = new LuxuryCar(new BasicCar());
		luxuryCar.assemble();
	}
}