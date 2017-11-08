package com.designPattern.behavioral.state;

public class TestState {
	public static void main(String[] args) {
		TVContext context = new TVContext();

		State startState = new TVStartState();
		context.setState(startState);
		context.doAction();

		State stopState = new TVStopState();
		context.setState(stopState);
		context.doAction();
	}
}