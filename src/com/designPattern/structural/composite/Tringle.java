package com.designPattern.structural.composite;

public class Tringle implements Shape {
	@Override
	public void draw(String color) {
		System.out.println("Drawing Tringle with Color - "+color);
	}
}