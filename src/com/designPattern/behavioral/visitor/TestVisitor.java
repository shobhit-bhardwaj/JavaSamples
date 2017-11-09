package com.designPattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class TestVisitor {
	public static int calculateCost(List<ItemElement> elements) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

		int totalCost = 0;
		for(ItemElement element : elements)
			totalCost += element.accept(visitor);

		return totalCost;
	}

	public static void main(String[] args) {
		List<ItemElement> elements = new ArrayList<>();
		elements.add(new Book("Book 1", 30));
		elements.add(new Book("Book 2", 80));
		elements.add(new Fruit("Fruit 1", 50));
		elements.add(new Fruit("Fruit 2", 100));
		elements.add(new Fruit("Fruit 3", 120));

		int totalCost = calculateCost(elements);
		System.out.println("Total Shopping Cart Cost - "+totalCost);
	}
}