package com.designPattern.behavioral.state;

/*
 * The state pattern solves problems where an object should change its behavior when its internal state changes.
 * Also, adding new states should not affect the behavior of existing states.
 * 
 * Example :-
 * 1. Mobile Phone Ringing State - Ringing, Vibrate, Silent.
 * 2. Swiggy Food Ordering State.
 * 3. Flipkart Order Delivery State.
 */
public class Client {
	public static void main(String[] args) {
		OrderContext context = new OrderContext();
		context.updateState();
		context.updateState();
		context.updateState();
		context.updateState();
		context.updateState();
	}
}