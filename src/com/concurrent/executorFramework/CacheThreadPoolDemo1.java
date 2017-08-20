package com.concurrent.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolDemo1 {
	public static void main(String[] args) {
		System.out.println("Main Thread Starts.");

		ExecutorService executor = Executors.newCachedThreadPool();
		executor.submit(new SimpleThreadTask());
		executor.submit(new SimpleThreadTask());
		executor.submit(new SimpleThreadTask());
		executor.submit(new SimpleThreadTask());
		executor.submit(new SimpleThreadTask());

		executor.shutdown();

		System.out.println("Main Thread Done.");
	}
}