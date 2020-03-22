package com.multithreading.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockAwaitSignal {
	private static class Worker {
		private Lock lock = new ReentrantLock();
		private Condition condition = lock.newCondition();

		public void awaitMethod() throws Exception {
			System.out.println("Starting awaitMethod");
			lock.lock();
			condition.await();
			System.out.println("awaitMethod Completed");
			lock.unlock();
		}

		public void signalMethod() throws Exception {
			System.out.println("Starting signalMethod");
			TimeUnit.SECONDS.sleep(2);
			lock.lock();
			condition.signal();
			System.out.println("signalMethod Completed");
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		final Worker worker = new Worker();

		Thread thread1 = new Thread(() ->  {
			try {
				worker.awaitMethod();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});
		Thread thread2 = new Thread(() ->  {
			try {
				worker.signalMethod();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		});

		thread1.start();
		thread2.start();
	}
}