package com.designPattern.behavioral.command;

public class FanStopCommand implements ICommand {
	private Fan fan;

	public FanStopCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		fan.fanStop();
	}
}