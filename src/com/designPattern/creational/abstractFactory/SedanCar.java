package com.designPattern.creational.abstractFactory;

public class SedanCar extends Car {
	public SedanCar(Location location) {
		super(CarType.SEDAN, location);
	}

	@Override
	public void construct() {
		System.out.println("Constructing Sedan Car.");
	}
}