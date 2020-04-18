package com.designPattern.behavioral.state;

public class Packaged implements OrderState {
	private static Packaged instance = new Packaged();

	private Packaged() {
	}

	public static Packaged getInstance() {
		return instance;
	}

	@Override
	public void updateState(OrderContext context) {
		System.out.println("Order is Packed");

		context.setState(OutOfDelivery.getInstance());
	}
}