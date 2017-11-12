package com.designPattern.structural.decorator;

public abstract class Currency {
	protected String description;

	public String getDescription() {
		return "Unknown Currency.";
	}

	public abstract int cost(int value);
}