package com.designPattern.behavioral.chainOfResponsibility;

public class Dollar5Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void next(DispenseChain chain) {
		this.chain = chain;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 5) {
			int number = currency.getAmount() / 5;
			int reminder = currency.getAmount() % 5;
			System.out.println("Dispensing "+number+" of 5 Note.");
			if(reminder != 0)
				chain.dispense(new Currency(reminder));
		} else {
			chain.dispense(currency);
		}
	}
}