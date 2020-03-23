package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadExecutorDemo {
	private static class SimpleThread implements Runnable {
		@Override
		public void run() {
			try {
				for(int i=0; i<5; i++) {
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Counter - " + (i + 1) + " - By Thread - " + Thread.currentThread().getName());
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();

		executor.submit(new SimpleThread());
		executor.submit(new SimpleThread());
		executor.submit(new SimpleThread());

		executor.shutdown();
	}
}