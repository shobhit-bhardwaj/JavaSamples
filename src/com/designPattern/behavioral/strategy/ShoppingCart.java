package com.designPattern.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<Item> items = new ArrayList<Item>();

	public void add(Item item) {
		items.add(item);
	}

	private int calculateAmount() {
		int total = 0;
		for (Item item : items)
			total += item.getItemPrice();

		return total;
	}

	public void pay(PaymentStrategy paymentStrategy) {
		int total = calculateAmount();

		paymentStrategy.pay(total);
	}
}