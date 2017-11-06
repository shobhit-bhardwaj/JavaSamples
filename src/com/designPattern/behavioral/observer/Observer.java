package com.designPattern.behavioral.observer;

public interface Observer {
	public void update();
	public void setSubject(Subject subject);
}