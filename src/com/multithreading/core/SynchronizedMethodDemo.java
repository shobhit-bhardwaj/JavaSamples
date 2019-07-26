package com.multithreading;

/*
class SynchronizedTask implements Runnable {
	private static int counter = 0;

	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			counter++;
		}
	}

	public static int getCounter() {
		return counter;
	}
}
*/		//	Problem with this Approach is, Two Thread can Read and Write at Same Time.

class SynchronizedTask implements Runnable {
	private static int counter = 0;

	//	Class Level Lock
	public static synchronized void increment() {
		counter++;
	}

	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			increment();
		}
	}

	public static int getCounter() {
		return counter;
	}
}

public class SynchronizedMethodDemo {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new SynchronizedTask());
		Thread thread2 = new Thread(new SynchronizedTask());
		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Counter - "+SynchronizedTask.getCounter());
	}
}