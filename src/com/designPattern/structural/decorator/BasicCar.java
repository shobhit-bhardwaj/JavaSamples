package com.designPattern.structural.decorator;

public class BasicCar implements Car {
	@Override
	public void assemble() {
		System.out.println("Basic Car");
	}
}