package com.designPattern.behavioral.observer;

public class MyTopicSubscriber implements Observer {
	private String name;
	private Subject subject;

	public MyTopicSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void update() {
		String message = subject.getUpdate(this);
		if(message == null)
			System.out.println(name+" - No New Message");
		else
			System.out.println(name+" - Consuming Message - "+message);
	}
}