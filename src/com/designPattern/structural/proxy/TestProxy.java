package com.designPattern.structural.proxy;

public class TestProxy {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("shobhit", "bhardwaj");
		executor.runCommand("rm -rf abc.txt");
		executor.runCommand("ls -al");

		System.out.println();

		executor = new CommandExecutorProxy("shobhit", "shobhit");
		executor.runCommand("rm -rf abc.txt");
		executor.runCommand("ls -al");
	}
}