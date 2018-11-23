package com.threads;

import java.util.concurrent.TimeUnit;

public class JoinThreadDemo {
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
				System.out.println("Starting Thread - " + name);
				TimeUnit.SECONDS.sleep(delay);
				System.out.println("Ending Thread - " + name);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Main Thread Start");

		SimpleThread thread1 = new SimpleThread("Thread 1", 4);
		SimpleThread thread2 = new SimpleThread("Thread 2", 2);
		SimpleThread thread3 = new SimpleThread("Thread 3", 7);

		thread1.start();
		thread2.start();
		thread3.start();

		System.out.println("Joining Thread 1");
		thread1.join();

		System.out.println("Joining Thread 2");
		thread2.join();

		System.out.println("Joining Thread 3");
		thread3.join();

		System.out.println("Main Thread End");
	}
}