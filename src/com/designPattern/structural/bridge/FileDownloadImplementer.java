package com.designPattern.structural.bridge;

public interface FileDownloadImplementer {
	public Object download(String path);
	public boolean store(Object file);
}