package com.designPattern.behavioral.state;

public class TVStartState implements State {
	@Override
	public void doAction() {
		System.out.println("TV is Turned On.");
	}
}