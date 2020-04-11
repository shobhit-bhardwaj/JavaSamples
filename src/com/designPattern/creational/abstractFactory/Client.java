package com.designPattern.creational.abstractFactory;

public class Client {
	public static void main(String[] args) {
		Car minicooper = CarFactory.buildCar(CarType.HATCHBACK, Location.ASIA);
		minicooper.construct();
		System.out.println(minicooper);
		System.out.println();

		Car optima = CarFactory.buildCar(CarType.SEDAN, Location.ASIA);
		optima.construct();
		System.out.println(optima);
		System.out.println();

		Car Outlander = CarFactory.buildCar(CarType.SUV, Location.ASIA);
		Outlander.construct();
		System.out.println(Outlander);
		System.out.println();

		Car hondaFit = CarFactory.buildCar(CarType.HATCHBACK, Location.USA);
		hondaFit.construct();
		System.out.println(hondaFit);
		System.out.println();

		Car camry = CarFactory.buildCar(CarType.SEDAN, Location.USA);
		camry.construct();
		System.out.println(camry);
		System.out.println();

		Car jeepCompass = CarFactory.buildCar(CarType.SUV, Location.USA);
		jeepCompass.construct();
		System.out.println(jeepCompass);
	}
}