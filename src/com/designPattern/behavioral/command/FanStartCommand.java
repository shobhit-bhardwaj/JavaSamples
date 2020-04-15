package com.designPattern.behavioral.command;

public class FanStartCommand implements ICommand {
	private Fan fan;

	public FanStartCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.fanStart();
	}
}