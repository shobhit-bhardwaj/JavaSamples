package com.designPattern.behavioral.command;

public class RemoteControl {
	private ICommand[] onCommands;
	private ICommand[] offCommands;

	public RemoteControl(int noOfDevices) {
		onCommands = new ICommand[noOfDevices];
		offCommands = new ICommand[noOfDevices];
	}

	public void registerDevice(int slot, ICommand onCommand, ICommand offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onClicked(int slot) {
		onCommands[slot].execute();
	}

	public void offClicked(int slot) {
		offCommands[slot].execute();
	}
}