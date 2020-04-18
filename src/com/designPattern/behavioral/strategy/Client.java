package com.designPattern.behavioral.strategy;

/*
 * In Strategy Design Pattern, we choose a specific implementation of algorithm or task in run time – out of multiple other implementations for same task.
 * The important point is that these implementations are interchangeable – based on task a implementation may be picked without disturbing the application workflow.
 */
public class Client {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();

		cart.add(new Item(10101, 100));
		cart.add(new Item(10102, 200));
		cart.add(new Item(10103, 300));

		cart.pay(new CreditCardStrategy("Test User", "1001 2002 3003 4004", 769, "2020-01-01"));
		cart.pay(new PaypalStrategy("aaa@bbb.com", "abcde"));
	}
}