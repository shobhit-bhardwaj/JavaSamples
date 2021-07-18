package com.designPattern.creational.builder;

public class Client {
	public static void main(String[] args) {
		Vehicle scooter = new Vehicle.VehicleBuilder(2, 2)
				.setStrokes(2)
				.build();
		System.out.println("Scooter Specification - " + scooter);

		Vehicle car = new Vehicle.VehicleBuilder(4, 5)
				.setAirbags(true)
				.setPowerStearing(true)
				.setPowerWindows(true)
				.build();
		System.out.println("Car Specification - " + car);
	}
}