package com.designPattern.structural.bridge;

public class LinuxFileDownloadImplementer implements FileDownloadImplementer {
	@Override
	public Object download(String path) {
		System.out.println("Download File in Linux OS.");
		return new Object();
	}

	@Override
	public boolean store(Object file) {
		System.out.println("Store File in Linux OS.");
		return true;
	}
}