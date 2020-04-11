package com.designPattern.creational.abstractFactory;

public class USACarFactory {
	public static Car buildCar(CarType type) {
		Car car = null;

		switch (type) {
		case HATCHBACK:
			car = new HatchBackCar(Location.USA);
			break;
		case SEDAN:
			car = new SedanCar(Location.USA);
			break;
		case SUV:
			car = new SUVCar(Location.USA);
			break;
		default:
			System.out.println("Not a Valid Type.");
			break;
		}

		return car;
	}
}