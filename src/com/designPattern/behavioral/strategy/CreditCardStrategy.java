package com.designPattern.behavioral.strategy;

public class CreditCardStrategy implements PaymentStrategy {
	private String cardHolderName;
	private String cardNo;
	private int cvvNo;
	private String expiryDate;

	public CreditCardStrategy(String cardHolderName, String cardNo, int cvvNo, String expiryDate) {
		this.cardHolderName = cardHolderName;
		this.cardNo = cardNo;
		this.cvvNo = cvvNo;
		this.expiryDate = expiryDate;
	}

	@Override
	public void pay(int amount) {
		System.out.println("Rs - " + amount + " Paid using Debit/Credit Card.");
	}
}