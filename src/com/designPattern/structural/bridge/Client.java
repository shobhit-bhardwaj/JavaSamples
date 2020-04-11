package com.designPattern.structural.bridge;

/*
 * Decouple an abstraction from its implementation so that the two can vary independently.
 * 
 * Bridge design pattern is used to decouple a class into two parts – abstraction and it’s implementation.
 * So that both can evolve in future without affecting each other.
 * It increases the loose coupling between class abstraction and it’s implementation.
 */

public class Client {
	public static void main(String[] args) {
		//	Linux File Downloader
		FileDownloaderAbstraction linuxDownloader = new FileDownloaderAbstractionImpl(new LinuxFileDownloadImplementer());
		Object linuxFile = linuxDownloader.download("linuxPath");
		linuxDownloader.store(linuxFile);

		//	Windows File Downloader
		FileDownloaderAbstraction windowsDownloader = new FileDownloaderAbstractionImpl(new WindowsFileDownloadImplementer());
		Object windowsFile = windowsDownloader.download("linuxPath");
		windowsDownloader.store(windowsFile);
	}
}