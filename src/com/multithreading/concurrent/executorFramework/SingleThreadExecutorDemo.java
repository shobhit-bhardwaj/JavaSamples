package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {
	public static void main(String[] args) {
		System.out.println("Main Thread Starts.");

		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(new SimpleThreadTask());
		executor.submit(new SimpleThreadTask());
		executor.submit(new SimpleThreadTask());

		executor.shutdown();

		System.out.println("Main Thread Done.");
	}
}