package com.designPattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	private List<Observer> observers;
	private String message;
	private boolean changed;

	private Object MUTEX = new Object();

	public MyTopic() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observer observer) {
		synchronized (MUTEX) {
			if(!observers.contains(observer))
				observers.add(observer);
		}
	}

	@Override
	public void unregister(Observer observer) {
		synchronized (MUTEX) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocal = null;
		synchronized (MUTEX) {
			if(!changed)
				return;
			observersLocal = new ArrayList<>(observers);
			this.changed = false;
		}
		for(Observer observer : observersLocal) {
			observer.update();
		}
	}

	@Override
	public String getUpdate(Observer observer) {
		return this.message;
	}

	public void putMessage(String message) {
		this.message = message;
		this.changed = true;
		notifyObservers();
	}
}