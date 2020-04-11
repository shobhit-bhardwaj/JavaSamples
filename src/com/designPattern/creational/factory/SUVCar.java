package com.designPattern.creational.factory;

public class SUVCar extends Car {
	public SUVCar() {
		super(CarType.SUV);
	}

	@Override
	public void construct() {
		System.out.println("Constructing SUV Car.");
	}
}