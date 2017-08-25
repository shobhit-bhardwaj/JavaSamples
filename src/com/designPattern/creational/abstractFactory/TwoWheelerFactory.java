package com.designPattern.creational.abstractFactory;

public class TwoWheelerFactory implements VehicleAbstractFactory {
	private int tyres;
	private int seats;

	public TwoWheelerFactory(int tyres, int seats) {
		this.tyres = tyres;
		this.seats = seats;
	}

	@Override
	public Vehicle getVehicle() {
		return new TwoWheeler(tyres, seats);
	}
}