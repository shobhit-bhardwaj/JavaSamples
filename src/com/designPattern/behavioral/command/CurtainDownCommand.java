package com.designPattern.behavioral.command;

public class CurtainDownCommand implements ICommand {
	private Curtain curtain;

	public CurtainDownCommand(Curtain curtain) {
		this.curtain = curtain;
	}

	@Override
	public void execute() {
		curtain.curtainDown();
	}
}