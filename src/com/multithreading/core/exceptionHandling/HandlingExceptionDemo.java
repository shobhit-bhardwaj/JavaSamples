package com.multithreading.exceptionHandling;

class ExceptionLeakingTask implements Runnable {
	@Override
	public void run() {
		throw new RuntimeException();
	}
}

public class HandlingExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Main Thread Start");

		Thread.setDefaultUncaughtExceptionHandler(new ThreadUncaughtExceptionHandler("DEFAULT_HANDLER"));
		Thread task1 = new Thread(new ExceptionLeakingTask(), "MyThread-1");
		task1.setUncaughtExceptionHandler(new ThreadUncaughtExceptionHandler("MyHandler-1"));
		Thread task2 = new Thread(new ExceptionLeakingTask(), "MyThread-2");
		Thread task3 = new Thread(new ExceptionLeakingTask(), "MyThread-3");
		Thread task4 = new Thread(new ExceptionLeakingTask(), "MyThread-4");
		task4.setUncaughtExceptionHandler(new ThreadUncaughtExceptionHandler("MyHandler-4"));

		task1.start();
		task2.start();
		task3.start();
		task4.start();

		System.out.println("Main Thread End");
	}
}