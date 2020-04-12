package com.designPattern.structural.composite;

public class Leaf implements Component {
	private String name;
	private int price;

	public Leaf(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int showPrice() {
		System.out.println("Name - " + name + " , Price - " + price);
		return price;
	}
}