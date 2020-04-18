package com.designPattern.behavioral.state;

public class Initiate implements OrderState {
	private static Initiate instance = new Initiate();

	private Initiate() {
	}

	public static Initiate getInstance() {
		return instance;
	}

	@Override
	public void updateState(OrderContext context) {
		System.out.println("Order is Initiate");

		context.setState(Approved.getInstance());
	}
}