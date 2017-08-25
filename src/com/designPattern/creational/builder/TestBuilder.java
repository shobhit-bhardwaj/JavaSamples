package com.designPattern.creational.builder;

import com.designPattern.creational.builder.Vehicle;

public class TestBuilder {
	public static void main(String[] args) {
		Vehicle scooter = new Vehicle.VehicleBuilder(2, 2).build();
		System.out.println("Scooter Specification - "+scooter);

		Vehicle car = new Vehicle.VehicleBuilder(4, 5).setAirbags(true).setPowerStearing(true).setPowerWindows(true).build();
		System.out.println("Car Specification - "+car);
	}
}