package com.designPattern.behavioral.visitor;

public class Book implements ItemElement {
	private String bookName;
	private int bookCost;

	public Book(String bookName, int bookCost) {
		this.bookName = bookName;
		this.bookCost = bookCost;
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookCost() {
		return bookCost;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}
}