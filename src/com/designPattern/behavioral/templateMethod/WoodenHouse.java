package com.designPattern.behavioral.templateMethod;

public class WoodenHouse extends HouseTemplate {
	@Override
	public void buildPillers() {
		System.out.println("Wooden Pillers are Build.");
	}

	@Override
	public void buildWalls() {
		System.out.println("Wooden Walls are Build.");
	}
}