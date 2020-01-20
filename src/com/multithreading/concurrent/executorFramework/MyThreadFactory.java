package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {
	private static int counter = 1;
	private static String name = "MyThread-";

	@Override
	public Thread newThread(Runnable runnable) {
		Thread thread = new Thread(runnable, name+counter++);
		return thread;
	}
}