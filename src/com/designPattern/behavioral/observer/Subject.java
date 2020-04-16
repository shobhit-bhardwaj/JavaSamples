package com.designPattern.behavioral.observer;

public interface Subject {
	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void updateAndNotify(String message);
}