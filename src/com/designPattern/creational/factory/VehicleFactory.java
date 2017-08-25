package com.designPattern.creational.factory;

public class VehicleFactory {
	public static Vehicle getVehicle(String type, int tyres, int seats) {
		Vehicle vehicle = null;

		if("TWO".equals(type))
			vehicle = new TwoWheeler(tyres, seats);
		else if("FOUR".equals(type))
			vehicle = new FourWheeler(tyres, seats);

		return vehicle;
	}
}