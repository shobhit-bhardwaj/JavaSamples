package com.designPattern.structural.decorator;

public class AUSDecorator extends Decorator {
	private Currency currency;

	public AUSDecorator(Currency currency) {
		this.currency = currency;
	}

	@Override
	public int cost(int value) {
		return currency.cost(value);
	}

	@Override
	public String getDescription() {
		return currency.getDescription()+" - Australian Doller";
	}
}