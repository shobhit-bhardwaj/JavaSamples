package com.designPattern.behavioral.state;

public class OrderContext {
	private OrderState orderState;

	public OrderContext() {
		orderState = Initiate.getInstance();
	}

	public void setState(OrderState orderState) {
		this.orderState = orderState;
	}

	public void updateState() {
		this.orderState.updateState(this);
	}
}