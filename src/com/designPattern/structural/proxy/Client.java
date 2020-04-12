package com.designPattern.structural.proxy;

/*
 * Proxy Design Pattern, a proxy object provide a surrogate or placeholder for another object to control access to it.
 * A proxy is basically a substitute for an intended object which we create due to many reasons.
 * e.g. security reasons or cost associated with creating fully initialized original object.
 */
public class Client {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("shobhit", "bhardwaj");
		executor.runCommand("rm -rf abc.txt");
		executor.runCommand("ls -al");

		System.out.println();

		executor = new CommandExecutorProxy("rajesh", "sharma");
		executor.runCommand("rm -rf abc.txt");
		executor.runCommand("ls -al");
	}
}