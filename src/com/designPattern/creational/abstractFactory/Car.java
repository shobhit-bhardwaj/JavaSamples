package com.designPattern.creational.abstractFactory;

public abstract class Car {
	private CarType type;
	private Location location;

	public Car(CarType type, Location location) {
		this.type = type;
		this.location = location;
	}

	public abstract void construct();

	@Override
	public String toString() {
		return "Car [type=" + type + ", location=" + location + "]";
	}
}