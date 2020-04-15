package com.designPattern.behavioral.command;

public class LightOffCommand implements ICommand {
	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.lightOff();
	}
}