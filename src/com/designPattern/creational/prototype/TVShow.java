package com.designPattern.creational.prototype;

public class TVShow implements PrototypeCapable {
	private String name;

	public TVShow(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public TVShow clone() throws CloneNotSupportedException {
		System.out.println("Cloning TVShow Object for - " + name);

		return (TVShow) super.clone();
	}

	@Override
	public String toString() {
		return "TVShow [name=" + name + "]";
	}
}