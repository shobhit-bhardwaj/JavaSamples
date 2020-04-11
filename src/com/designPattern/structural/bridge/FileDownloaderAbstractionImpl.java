package com.designPattern.structural.bridge;

public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction {
	private FileDownloadImplementer implementer;

	public FileDownloaderAbstractionImpl(FileDownloadImplementer implementer) {
		this.implementer = implementer;
	}

	@Override
	public Object download(String path) {
		return implementer.download(path);
	}

	@Override
	public boolean store(Object file) {
		return implementer.store(file);
	}
}