package com.designPattern.creational.abstractFactory;

public class CarFactory {
	public static Car buildCar(CarType type, Location location) {
		Car car = null;

		switch (location) {
		case ASIA:
			car = AsiaCarFactory.buildCar(type);
			break;
		case USA:
			car = USACarFactory.buildCar(type);
			break;
		default:
			System.out.println("Not a Valid Location.");
			break;
		}

		return car;
	}
}