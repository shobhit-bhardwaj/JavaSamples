package com.designPattern.creational.abstractFactory;

public class AsiaCarFactory {
	public static Car buildCar(CarType type) {
		Car car = null;

		switch (type) {
		case HATCHBACK:
			car = new HatchBackCar(Location.ASIA);
			break;
		case SEDAN:
			car = new SedanCar(Location.ASIA);
			break;
		case SUV:
			car = new SUVCar(Location.ASIA);
			break;
		default:
			System.out.println("Not a Valid Type.");
			break;
		}

		return car;
	}
}