package com.designPattern.structural.decorator;

public class Doller extends Currency {
	private int value;

	@Override
	public String getDescription() {
		description = "Doller Currency";
		return description;
	}

	@Override
	public int cost(int value) {
		this.value = value;
		return this.value;
	}
}