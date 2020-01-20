package com.multithreading.concurrent.executorFramework.exceptionHandling;

import java.util.concurrent.ThreadFactory;

public class MyThreadFactory implements ThreadFactory {
	private static int counter = 0;
	public Thread newThread(Runnable runnable) {
		counter++;
		Thread thread = new Thread(runnable, "MyThread-"+counter);
		if(counter%2 == 0)
			thread.setUncaughtExceptionHandler(new ThreadUncaughtExceptionHandler("MyHandler-"+counter));
		return thread;
	}
}