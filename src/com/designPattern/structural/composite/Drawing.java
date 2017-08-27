package com.designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
	private List<Shape> shapes = new ArrayList<>();

	public void add(Shape shape) {
		shapes.add(shape);
	}

	public void clear() {
		shapes.clear();
	}

	@Override
	public void draw(String color) {
		for(Shape shape : shapes)
			shape.draw(color);
	}
}