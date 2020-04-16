package com.designPattern.behavioral.observer;

public class Subscriber implements Observer {
	private String subscriberName;

	public Subscriber(String subscriberName) {
		this.subscriberName = subscriberName;
	}

	@Override
	public void subscription(String message) {
		System.out.println("New Content Received - " + subscriberName + " - " + message);
	}
}