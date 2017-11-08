package com.java8;

interface Cube {
	default double area() {
		return 1*1;
	}

	static double area(double a) {
		return a*a;
	}

	void print();
}

interface Circle {
	default double area() {
		return Math.PI*1*1;
	}

	static double area(double r) {
		return Math.PI*r*r;
	}

	void print();
}

public class DefaultMethods implements Cube, Circle {
	@Override
	public double area() {
		return Cube.super.area();
	}

	@Override
	public void print() {
		System.out.println("Default Method");
	}

	public static void main(String[] args) {
		DefaultMethods object = new DefaultMethods();
		System.out.println(object.area());
	}
}