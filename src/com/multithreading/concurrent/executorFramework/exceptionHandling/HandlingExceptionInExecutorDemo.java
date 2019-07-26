package com.concurrent.executorFramework.exceptionHandling;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.multithreading.exceptionHandling.ThreadUncaughtExceptionHandler;

class ExceptionLeakingTask implements Runnable {
	@Override
	public void run() {
		throw new RuntimeException();
	}
}

public class HandlingExceptionInExecutorDemo {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool(new MyThreadFactory());
		Thread.setDefaultUncaughtExceptionHandler(new ThreadUncaughtExceptionHandler("DEFAULT_HANDLER"));

		executorService.execute(new ExceptionLeakingTask());
		executorService.execute(new ExceptionLeakingTask());
		executorService.execute(new ExceptionLeakingTask());
		executorService.execute(new ExceptionLeakingTask());

		executorService.shutdown();
	}
}