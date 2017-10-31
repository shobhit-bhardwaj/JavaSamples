package com.designPattern.behavioral.templateMethod;

public class GlassHouse extends HouseTemplate {
	@Override
	public void buildPillers() {
		System.out.println("Concrete Pillers are Build.");
	}

	@Override
	public void buildWalls() {
		System.out.println("Glass Walls are Build.");
	}
}