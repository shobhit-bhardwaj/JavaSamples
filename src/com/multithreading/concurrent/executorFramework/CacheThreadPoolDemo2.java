package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CacheThreadPoolDemo2 {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Thread Starts.");

		ExecutorService executor = Executors.newCachedThreadPool(new MyThreadFactory());
		executor.submit(new SimpleThreadTask());
		executor.submit(new SimpleThreadTask());
		executor.submit(new SimpleThreadTask());

		TimeUnit.SECONDS.sleep(15);

		//	Re-Use Threads from the Pool
		executor.submit(new SimpleThreadTask());
		executor.submit(new SimpleThreadTask());

		executor.shutdown();

		System.out.println("Main Thread Done.");
	}
}