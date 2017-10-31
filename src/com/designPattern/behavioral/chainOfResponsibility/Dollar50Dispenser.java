package com.designPattern.behavioral.chainOfResponsibility;

public class Dollar50Dispenser implements DispenseChain {
	private DispenseChain chain;

	@Override
	public void next(DispenseChain chain) {
		this.chain = chain;
	}

	@Override
	public void dispense(Currency currency) {
		if(currency.getAmount() >= 50) {
			int number = currency.getAmount() / 50;
			int reminder = currency.getAmount() % 50;
			System.out.println("Dispensing "+number+" of 50 Note.");
			if(reminder != 0)
				chain.dispense(new Currency(reminder));
		} else {
			chain.dispense(currency);
		}
	}
}