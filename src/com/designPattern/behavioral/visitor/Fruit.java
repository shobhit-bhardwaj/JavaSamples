package com.designPattern.behavioral.visitor;

public class Fruit implements ItemElement {
	private String fruitName;
	private int fruitCost;

	public Fruit(String fruitName, int fruitCost) {
		this.fruitName = fruitName;
		this.fruitCost = fruitCost;
	}

	public String getFruitName() {
		return fruitName;
	}

	public int getFruitCost() {
		return fruitCost;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}