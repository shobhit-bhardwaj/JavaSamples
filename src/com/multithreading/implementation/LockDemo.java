package com.multithreading.implementation;

class Lock {
	private boolean isLocked;

	public synchronized void lock() throws InterruptedException {
		while(isLocked) {
			wait();
		}
		isLocked = true;
	}

	public synchronized void unlock() {
		isLocked = false;
		notifyAll();
	}
}

class LockTask extends Thread {
	private static Lock lock = new Lock();
	private static int counter = 0;

	private void increment() {
		try {
			lock.lock();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		counter ++;
		lock.unlock();
	}

	@Override
	public void run() {
		for(int i=0; i<1000; i++)
			increment();
	}

	public static int getCounter() {
		return counter;
	}
}

public class LockDemo {
	public static void main(String[] args) {
		Thread thread1 = new LockTask();
		Thread thread2 = new LockTask();

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Counter - "+LockTask.getCounter());
	}
}