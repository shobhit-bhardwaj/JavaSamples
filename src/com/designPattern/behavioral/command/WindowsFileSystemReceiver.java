package com.designPattern.behavioral.command;

public class WindowsFileSystemReceiver implements FileSystemReceiver {
	@Override
	public void openFile() {
		System.out.println("Opening File from Windows File System");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing File into Windows File System");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing File from Windows File System");
	}
}