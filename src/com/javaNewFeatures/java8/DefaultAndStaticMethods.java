package com.javaNewFeatures.java8;

interface Cube {
	public default double area() {
		return 1*1;
	}

	public static double area(double a) {
		return a*a;
	}

	public abstract void printCube();
}

interface Circle {
	public default double area() {
		return Math.PI*1*1;
	}

	public static double area(double r) {
		return Math.PI*r*r;
	}

	public abstract void printCircle();
}

public class DefaultAndStaticMethods implements Cube, Circle {
	@Override
	public double area() {
		//return Circle.super.area();
		//return Cube.super.area();

		return 2 * 2;
	}

	@Override
	public void printCube() {
		System.out.println("Print Cube Method");
	}

	@Override
	public void printCircle() {
		System.out.println("Print Circle Method");
	}

	public static void main(String[] args) {
		DefaultAndStaticMethods object = new DefaultAndStaticMethods();

		System.out.println("Default Method - " + object.area());

		System.out.println("Cube Static Method - " + Cube.area(2));
		System.out.println("Circle Static Method - " + Circle.area(2));
	}
}