package com.designPattern.behavioral.command;

public class TestCommand {
	public static void main(String[] args) {
		FileSystemReceiver receiver = FileSystemReceiverUtil.getFileSystemReceiver();

		OpenFileCommand openFileCommand = new OpenFileCommand(receiver);
		FileInvoker invoker = new FileInvoker(openFileCommand);
		invoker.execute();

		WriteFileCommand writeFileCommand = new WriteFileCommand(receiver);
		invoker = new FileInvoker(writeFileCommand);
		invoker.execute();

		CloseFileCommand closeFileCommand = new CloseFileCommand(receiver);
		invoker = new FileInvoker(closeFileCommand);
		invoker.execute();
	}
}