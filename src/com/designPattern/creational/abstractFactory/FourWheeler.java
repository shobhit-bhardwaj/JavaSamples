package com.designPattern.creational.abstractFactory;

public class FourWheeler extends Vehicle {
	private int tyres;
	private int seats;

	public FourWheeler(int tyres, int seats) {
		this.tyres = tyres;
		this.seats = seats;
	}

	@Override
	public int getTyres() {
		return tyres;
	}

	@Override
	public int getSeats() {
		return seats;
	}
}