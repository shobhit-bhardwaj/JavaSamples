package com.designPattern.behavioral.command;

public class CurtainUpCommand implements ICommand {
	private Curtain curtain;

	public CurtainUpCommand(Curtain curtain) {
		this.curtain = curtain;
	}

	@Override
	public void execute() {
		curtain.curtainUp();
	}
}