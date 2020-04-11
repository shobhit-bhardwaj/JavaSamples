package com.designPattern.creational.factory;

public class CarFactory {
	public static Car buildCar(CarType type) {
		Car car = null;

		switch (type) {
		case HATCHBACK:
			car = new HatchBackCar();
			break;
		case SEDAN:
			car = new SedanCar();
			break;
		case SUV:
			car = new SUVCar();
			break;
		default:
			System.out.println("Not a Valid Type.");
			break;
		}

		return car;
	}
}