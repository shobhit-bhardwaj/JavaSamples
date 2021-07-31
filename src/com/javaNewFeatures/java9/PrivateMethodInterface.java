package com.javaNewFeatures.java9;

interface IFace {
	private double getPI() {
		return 3.14;
	}

	public default double getArea(int radius) {
		return getPI() * radius * radius;
	}
}

public class PrivateMethodInterface implements IFace {
	public static void main(String[] args) {
		IFace iFace = new IFace() {};

		double defaultArea = iFace.getArea(5);
		System.out.println("Default Area - " + defaultArea);
	}
}