package com.designPattern.structural.composite;

public class TestComposite {
	public static void main(String[] args) {
		Drawing drawing = new Drawing();

		Shape circle1 = new Circle();
		Shape tringle1 = new Tringle();
		drawing.add(circle1);
		drawing.add(tringle1);
		drawing.draw("RED");

		drawing.clear();

		Shape circle2 = new Circle();
		Shape tringle2 = new Tringle();
		drawing.add(circle2);
		drawing.add(tringle2);
		drawing.draw("GREEN");
	}
}