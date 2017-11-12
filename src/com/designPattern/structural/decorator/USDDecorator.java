package com.designPattern.structural.decorator;

public class USDDecorator extends Decorator {
	private Currency currency;

	public USDDecorator(Currency currency) {
		this.currency = currency;
	}

	@Override
	public int cost(int value) {
		return currency.cost(value);
	}

	@Override
	public String getDescription() {
		return currency.getDescription()+" - USDoller";
	}
}