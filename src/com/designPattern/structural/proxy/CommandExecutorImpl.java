package com.designPattern.structural.proxy;

public class CommandExecutorImpl implements CommandExecutor {
	@Override
	public void runCommand(String command) {
		try {
			System.out.println("Executing Command - " + command);

			Runtime.getRuntime().exec(command);

			System.out.println("Command Executed - " + command);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}