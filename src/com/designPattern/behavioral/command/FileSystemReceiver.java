package com.designPattern.behavioral.command;

public interface FileSystemReceiver {
	public void openFile();
	public void writeFile();
	public void closeFile();
}