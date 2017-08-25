package com.designPattern.creational.abstractFactory;

public class FourWheelerFactory implements VehicleAbstractFactory {
	private int tyres;
	private int seats;

	public FourWheelerFactory(int tyres, int seats) {
		this.tyres = tyres;
		this.seats = seats;
	}

	@Override
	public Vehicle getVehicle() {
		return new FourWheeler(tyres, seats);
	}
}