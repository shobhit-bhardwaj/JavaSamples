package com.designPattern.structural.decorator;

public class Rupees extends Currency {
	private int value;

	@Override
	public String getDescription() {
		description = "Indian Currency";
		return description;
	}

	@Override
	public int cost(int value) {
		this.value = value;
		return this.value;
	}
}