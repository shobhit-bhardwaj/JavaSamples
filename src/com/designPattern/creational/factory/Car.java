package com.designPattern.creational.factory;

public abstract class Car {
	private CarType type;

	public Car(CarType type) {
		this.type = type;
	}

	public CarType getType() {
		return type;
	}

	public void setType(CarType type) {
		this.type = type;
	}

	public abstract void construct();
}