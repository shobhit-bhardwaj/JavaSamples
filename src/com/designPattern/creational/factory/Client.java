package com.designPattern.creational.factory;

public class Client {
	public static void main(String[] args) {
		Car baleno = CarFactory.buildCar(CarType.HATCHBACK);
		baleno.construct();

		Car verna = CarFactory.buildCar(CarType.SEDAN);
		verna.construct();

		Car scorpio = CarFactory.buildCar(CarType.SUV);
		scorpio.construct();
	}
}