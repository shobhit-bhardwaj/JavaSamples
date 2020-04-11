package com.designPattern.structural.bridge;

public class WindowsFileDownloadImplementer implements FileDownloadImplementer {
	@Override
	public Object download(String path) {
		System.out.println("Download File in Windows OS.");
		return new Object();
	}

	@Override
	public boolean store(Object file) {
		System.out.println("Store File in Windows OS.");
		return true;
	}
}