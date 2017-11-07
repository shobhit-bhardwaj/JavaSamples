package com.designPattern.behavioral.command;

public class OpenFileCommand implements Command {
	private FileSystemReceiver fileSystemReceiver;

	public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
		this.fileSystemReceiver = fileSystemReceiver;
	}

	@Override
	public void execute() {
		fileSystemReceiver.openFile();
	}
}