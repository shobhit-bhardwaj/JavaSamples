package com.designPattern.behavioral.templateMethod;

public class TestTemplateMethod {
	public static void main(String[] args) {
		HouseTemplate woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();
		System.out.println();

		HouseTemplate glassHouse = new GlassHouse();
		glassHouse.buildHouse();
	}
}