package com.designPattern.behavioral.state;

public class TVStopState implements State {
	@Override
	public void doAction() {
		System.out.println("TV is Turned Off.");
	}
}