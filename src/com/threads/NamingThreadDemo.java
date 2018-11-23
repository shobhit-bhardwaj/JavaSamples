package com.threads;

public class NamingThreadDemo {
	private static class SimpleThread extends Thread {
		private String name;

		public SimpleThread(String name) {
			super(name);
			this.name = name;
		}

		@Override
		public void run() {
			System.out.println("Simple Thread Run By - " + name);
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Main Thread Start");

		SimpleThread thread1 = new SimpleThread("Simple Thread");
		thread1.run();

		Thread thread2 = new Thread(() -> System.out.println("Runnable Thread Run By - " + Thread.currentThread().getName()), "Runnable Thread");
		thread2.start();

		System.out.println("Main Thread End");
	}
}