package com.designPattern.behavioral.command;

public class FileInvoker {
	private Command command;

	public FileInvoker(Command command) {
		this.command = command;
	}

	public void execute() {
		this.command.execute();
	}
}