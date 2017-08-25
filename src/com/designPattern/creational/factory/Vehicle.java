package com.designPattern.creational.factory;

public abstract class Vehicle {
	public abstract int getTyres();
	public abstract int getSeats();

	@Override
	public String toString() {
		return "Tyres - "+getTyres()+" | Seats - "+getSeats();
	}
}