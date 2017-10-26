package com.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class MyThread extends Thread {
	private String threadName;
	private Semaphore semaphore;

	public MyThread(String threadName, Semaphore semaphore) {
		this.threadName = threadName;
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		try {
			semaphore.acquire();
			System.out.println("Semaphore acquire by - "+threadName);
			for(int i=0; i<5; i++) {
				boolean hasQueue = semaphore.hasQueuedThreads();
				if(hasQueue)
					System.out.println(semaphore.getQueueLength());
				TimeUnit.MILLISECONDS.sleep(500);
			}
			semaphore.release();
			System.out.println("Semaphore release by - "+threadName);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class SemaphoreTest {
	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(1);
		Thread thread1 = new MyThread("Thread1", semaphore);
		Thread thread2 = new MyThread("Thread2", semaphore);
		thread1.start();
		thread2.start();
	}
}