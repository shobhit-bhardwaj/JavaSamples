package com.designPattern.behavioral.chainOfResponsibility;

public class TestChainOfResponsibility {
	public static void main(String[] args) {
		DispenseChain chain1 = new Dollar50Dispenser();
		DispenseChain chain2 = new Dollar20Dispenser();
		DispenseChain chain3 = new Dollar10Dispenser();
		DispenseChain chain4 = new Dollar5Dispenser();
		chain1.next(chain2);
		chain2.next(chain3);
		chain3.next(chain4);

		int amount = 585;
		chain1.dispense(new Currency(amount));
	}
}