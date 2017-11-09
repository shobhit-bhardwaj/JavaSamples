package com.designPattern.behavioral.visitor;

public interface ItemElement {
	public int accept(ShoppingCartVisitor visitor);
}