package com.multithreading;

import java.util.concurrent.TimeUnit;

public class SimpleThreadCreationByClass {
	private static class SimpleThread extends Thread {
		private String name;
		private int delay;

		public SimpleThread(String name, int delay) {
			super(name);

			this.name = name;
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

		SimpleThread thread1 = new SimpleThread("Simple Thread 1", 2);
		Thread thread2 = new Thread(() -> { System.out.println("This is Runnable Thread"); }, "Runnable Thread 2");

		thread1.start();
		thread2.start();

		System.out.println("Main Thread End");
	}
}