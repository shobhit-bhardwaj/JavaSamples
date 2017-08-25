package com.designPattern.creational.factory;

public class TestFactory {
	public static void main(String[] args) {
		Vehicle scooter = VehicleFactory.getVehicle("TWO", 2, 2);
		System.out.println("Scooter Specification - "+scooter);

		Vehicle car = VehicleFactory.getVehicle("FOUR", 4, 5);
		System.out.println("Car Specification - "+car);
	}
}