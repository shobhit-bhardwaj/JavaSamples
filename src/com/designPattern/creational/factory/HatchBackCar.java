package com.designPattern.creational.factory;

public class HatchBackCar extends Car {
	public HatchBackCar() {
		super(CarType.HATCHBACK);
	}

	@Override
	public void construct() {
		System.out.println("Constructing HatchBack Car.");
	}
}