package com.designPattern.behavioral.state;

public class Approved implements OrderState {
	private static Approved instance = new Approved();

	private Approved() {
	}

	public static Approved getInstance() {
		return instance;
	}

	@Override
	public void updateState(OrderContext context) {
		System.out.println("Order is Approved");

		context.setState(Packaged.getInstance());
	}
}