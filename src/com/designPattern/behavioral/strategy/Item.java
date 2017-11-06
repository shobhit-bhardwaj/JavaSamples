package com.designPattern.behavioral.strategy;

public class Item {
	private int itemCode;
	private int itemPrice;

	public Item(int itemCode, int itemPrice) {
		this.itemCode = itemCode;
		this.itemPrice = itemPrice;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
}