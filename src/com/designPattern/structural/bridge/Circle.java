package com.designPattern.structural.bridge;

public class Circle extends Shape {
	public Circle(Color color) {
		super(color);
	}

	public void fillColor() {
		System.out.println("Circle Fill with Color");
		color.fillColor();
	}
}