package com.designPattern.creational.prototype;

public class WebSeries implements PrototypeCapable {
	private String name;

	public WebSeries(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public WebSeries clone() throws CloneNotSupportedException {
		System.out.println("Cloning WebSeries Object for - " + name);

		return (WebSeries) super.clone();
	}

	@Override
	public String toString() {
		return "WebSeries [name=" + name + "]";
	}
}