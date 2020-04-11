package com.designPattern.creational.abstractFactory;

public class SUVCar extends Car {
	public SUVCar(Location location) {
		super(CarType.SUV, location);
	}

	@Override
	public void construct() {
		System.out.println("Constructing SUV Car.");
	}
}