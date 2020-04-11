package com.designPattern.creational.abstractFactory;

public class HatchBackCar extends Car {
	public HatchBackCar(Location location) {
		super(CarType.HATCHBACK, location);
	}

	@Override
	public void construct() {
		System.out.println("Constructing HatchBack Car.");
	}
}