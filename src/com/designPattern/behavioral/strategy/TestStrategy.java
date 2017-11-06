package com.designPattern.behavioral.strategy;

public class TestStrategy {
	public static void main(String[] args) {
		Item item1 = new Item(10101, 100);
		Item item2 = new Item(10102, 200);
		Item item3 = new Item(10103, 300);

		ShoppingCart cart = new ShoppingCart();
		cart.add(item1);
		cart.add(item2);
		cart.add(item3);

		cart.pay(new CreditCardStrategy("Test User", 100200, 300, "2020-01-01"));
		cart.pay(new PaypalStrategy("aaa@bbb.com", "abcde"));
	}
}