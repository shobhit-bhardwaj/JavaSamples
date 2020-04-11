package com.designPattern.creational.factory;

public class SedanCar extends Car {
	public SedanCar() {
		super(CarType.SEDAN);
	}

	@Override
	public void construct() {
		System.out.println("Constructing Sedan Car.");
	}
}