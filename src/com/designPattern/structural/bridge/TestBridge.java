package com.designPattern.structural.bridge;

public class TestBridge {
	public static void main(String[] args) {
		Shape tringleGreen = new Tringle(new GreenColor());
		tringleGreen.fillColor();
		System.out.println();

		Shape tringleBlue = new Tringle(new BlueColor());
		tringleBlue.fillColor();
		System.out.println();

		Shape circleGreen = new Circle(new GreenColor());
		circleGreen.fillColor();
		System.out.println();

		Shape circleBlue = new Circle(new BlueColor());
		circleBlue.fillColor();
	}
}