package com.designPattern.behavioral.state;

public class OutOfDelivery implements OrderState {
	private static OutOfDelivery instance = new OutOfDelivery();

	private OutOfDelivery() {
	}

	public static OutOfDelivery getInstance() {
		return instance;
	}

	@Override
	public void updateState(OrderContext context) {
		System.out.println("Order is Out of Delivery");

		context.setState(Delivered.getInstance());
	}
}