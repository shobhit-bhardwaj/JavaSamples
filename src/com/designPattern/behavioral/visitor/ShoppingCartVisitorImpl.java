package com.designPattern.behavioral.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
	@Override
	public int visit(Book book) {
		if(book.getBookCost() > 50)
			return book.getBookCost() - 5;
		else
			return book.getBookCost();
	}

	@Override
	public int visit(Fruit fruit) {
		if(fruit.getFruitCost() > 70)
			return fruit.getFruitCost() - 8;
		else
			return fruit.getFruitCost();
	}
}