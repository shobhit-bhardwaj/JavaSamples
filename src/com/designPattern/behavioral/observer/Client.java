package com.designPattern.behavioral.observer;

/*
 * Observer Design Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents
 * are notified and updated automatically. It is also referred to as the publish-subscribe pattern.
 * 
 * In observer pattern, there are many observers (subscriber objects) that are observing a particular subject (publisher object).
 * Observers register themselves to a subject to get a notification when there is a change made inside that subject.
 * Observer object can register or unregister from subject at any point of time. It helps is making the objects objects loosely coupled.
 */
public class Client {
	public static void main(String[] args) {
		Subject channel = new YouTubeChannel("Shobhit Youtube Channel");

		Observer subscriber1 = new Subscriber("Ramesh");
		Observer subscriber2 = new Subscriber("Tapan");
		Observer subscriber3 = new Subscriber("Aman");
		Observer subscriber4 = new Subscriber("Deepak");
		Observer subscriber5 = new Subscriber("Sameer");

		channel.addObserver(subscriber1);
		channel.addObserver(subscriber2);
		channel.addObserver(subscriber3);
		channel.addObserver(subscriber4);
		channel.addObserver(subscriber5);

		channel.removeObserver(subscriber4);
		channel.removeObserver(subscriber5);

		channel.updateAndNotify("This is Java Design Pattern Content");
	}
}