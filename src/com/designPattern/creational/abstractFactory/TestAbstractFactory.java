package com.designPattern.creational.abstractFactory;

public class TestAbstractFactory {
	public static void main(String[] args) {
		Vehicle scooter = VehicleFactory.getVehicle(new TwoWheelerFactory(2, 2));
		System.out.println("Scooter Specification - "+scooter);

		Vehicle car = VehicleFactory.getVehicle(new FourWheelerFactory(4, 5));
		System.out.println("Car Specification - "+car);
	}
}