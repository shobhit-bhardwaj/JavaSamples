package com.designPattern.behavioral.templateMethod;

public abstract class HouseTemplate {
	public final void buildHouse() {
		buildFoundation();
		buildPillers();
		buildWalls();
		buildWindows();
		System.out.println("House is Build.");
	}

	private void buildFoundation() {
		System.out.println("Foundation is Build.");
	}

	public abstract void buildPillers();
	public abstract void buildWalls();

	private void buildWindows() {
		System.out.println("Windows are Build.");
	}
}