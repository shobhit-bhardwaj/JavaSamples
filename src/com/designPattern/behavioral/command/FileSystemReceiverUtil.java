package com.designPattern.behavioral.command;

public class FileSystemReceiverUtil {
	public static FileSystemReceiver getFileSystemReceiver() {
		String osName = System.getProperty("os.name");
		System.out.println("OS Name - "+osName);

		if(osName.contains("Windows"))
			return new WindowsFileSystemReceiver();
		else
			return new LinuxFileSystemReceiver();
	}
}