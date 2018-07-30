package com.java9;

public class ProcessAPI {
	public static void main(String[] args) {
		ProcessHandle currentProcess = ProcessHandle.current();

		System.out.println("All processes - ");
		ProcessHandle.allProcesses().forEach(process -> System.out.println(process.pid()+" - "+process.info()));
		System.out.println();

		System.out.println("Current Process Id - " + currentProcess.pid());
		System.out.println("Direct Children - " + currentProcess.children());
		System.out.println("Class Name - " + currentProcess.getClass());
		System.out.println("Process Info - " + currentProcess.info());
		System.out.println("Is Process Alive - " + currentProcess.isAlive());
		System.out.println("Process's Parent - " + currentProcess.parent());
	}
}