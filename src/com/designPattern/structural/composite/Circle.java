package com.designPattern.structural.composite;

public class Circle implements Shape {
	@Override
	public void draw(String color) {
		System.out.println("Drawing Circle with Color - "+color);
	}
}