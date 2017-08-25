package com.designPattern.creational.abstractFactory;

public class TwoWheeler extends Vehicle {
	private int tyres;
	private int seats;

	public TwoWheeler(int tyres, int seats) {
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