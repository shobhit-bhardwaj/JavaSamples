package com.designPattern.behavioral.state;

public class Delivered implements OrderState {
	private static Delivered instance = new Delivered();

	private Delivered() {
	}

	public static Delivered getInstance() {
		return instance;
	}

	@Override
	public void updateState(OrderContext context) {
		System.out.println("Order is Delivered");
	}
}