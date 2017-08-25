package com.designPattern.creational.abstractFactory;

public class VehicleFactory {
	public static Vehicle getVehicle(VehicleAbstractFactory abstractFactory) {
		return abstractFactory.getVehicle();
	}
}