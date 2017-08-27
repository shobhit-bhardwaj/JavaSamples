package com.designPattern.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor {
	@Override
	public void runCommand(String command) {
		System.out.println("Executing Command - "+command);
		try {
			Runtime.getRuntime().exec(command);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Command Executed - "+command);
	}
}