package com.designPattern.creational.prototype;

public class Movie implements PrototypeCapable {
	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("Cloning Movie Object for - " + name);

		return (Movie) super.clone();
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + "]";
	}
}