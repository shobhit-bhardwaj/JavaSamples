package com.multithreading;

import java.util.concurrent.TimeUnit;

public class SimpleThreadCreationByRunnable {
	private static class SimpleRunnable implements Runnable {
		private int delay;

		public SimpleRunnable(int delay) {
			this.delay = delay;
		}

		@Override
		public void run() {
			try {
				System.out.println("Thread run() Start By - " + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(delay);
				System.out.println("Thread run() End By - " + Thread.currentThread().getName());
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Thread Start");

		Thread thread1 = new Thread(new SimpleRunnable(2), "Runnable Thread 1");
		Thread thread2 = new Thread(() -> { System.out.println("This is Runnable Thread 2"); }, "Runnable Thread 1");

		thread1.start();
		thread2.start();

		System.out.println("Main Thread End");
	}
}