package com.multithreading.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Locker {
	private Lock lock = new ReentrantLock();

	public void lockingMethod() {
		try {
			String threadName = Thread.currentThread().getName();

			System.out.println("--- Acquirng Lock --- " + threadName);
			lock.lock();

			System.out.println("In Critical Section - " + threadName);
			TimeUnit.SECONDS.sleep(3);

			lock.unlock();
			System.out.println("--- Release Lock --- " + threadName);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

class LockingThread extends Thread {
	private Locker locker;

	public LockingThread(Locker locker) {
		this.locker = locker;
	}

	public void run() {
		locker.lockingMethod();
	}
}

public class ReentrantLockTest {
	public static void main(String[] args) throws Exception {
		Locker locker = new Locker();

		for(int i=0; i<5; i++) {
			new LockingThread(locker).start();
		}
	}
}