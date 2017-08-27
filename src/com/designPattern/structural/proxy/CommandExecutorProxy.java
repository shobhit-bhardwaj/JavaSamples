package com.designPattern.structural.proxy;

public class CommandExecutorProxy implements CommandExecutor {
	private boolean isAdmin = false;
	private CommandExecutor executor;

	public CommandExecutorProxy(String username, String password) {
		if("shobhit".equals(username) && "bhardwaj".equals(password))
			isAdmin = true;

		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String command) {
		if(isAdmin)
			executor.runCommand(command);
		else {
			if(command.trim().contains("rm"))
				System.out.println("Access Denied for Non Admin.");
			else
				executor.runCommand(command);
		}
	}
}