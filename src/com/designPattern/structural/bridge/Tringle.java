package com.designPattern.structural.bridge;

public class Tringle extends Shape {
	public Tringle(Color color) {
		super(color);
	}

	public void fillColor() {
		System.out.println("Tringle Fill with Color");
		color.fillColor();
	}
}