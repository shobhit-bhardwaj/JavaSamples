package com.designPattern.behavioral.chainOfResponsibility;

/*
 * The Chain of Responsibility Design Pattern gives more than one object an opportunity to handle a request by linking receiving objects together.
 * It allows a number of classes to attempt to handle a request, independently of any other object along the chain.
 * 
 * Once the request is handled, it completes it’s journey through the chain. Extra handlers can be added or removed from chain without modifying the logic inside any of concrete handler.
 */
public class Client {
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