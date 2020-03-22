package com.multithreading.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
	private static class Worker {
		private Lock lock = new ReentrantLock();

		public void myMethod() {
			try {
				System.out.println("Starting myMethod by - " + Thread.currentThread().getName());

				lock.lock();
				System.out.println("Entering lock section by - " + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(3);
				System.out.println("Returning lock section by - " + Thread.currentThread().getName());
				lock.unlock();

				System.out.println("Returning myMethod by - " + Thread.currentThread().getName());
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Worker worker = new Worker();

		Thread[] threads = new Thread[5];
		for(int i=0; i<5; i++) {
			threads[i] = new Thread(() ->  {
				worker.myMethod();
			});
			threads[i].start();
		}
	}
}