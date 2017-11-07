package com.designPattern.behavioral.command;

public class LinuxFileSystemReceiver implements FileSystemReceiver {
	@Override
	public void openFile() {
		System.out.println("Opening File from Linux File System");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing File into Linux File System");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing File from Linux File System");
	}
}