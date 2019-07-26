package com.concurrent.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class TerminatingExecutorThreadTask1 implements Runnable {
	private int number;
	private int delay;

	private volatile boolean shutdown;

	public TerminatingExecutorThreadTask1(int number, int delay) {
		this.number = number;
		this.delay = delay;
	}

	@Override
	public void run() {
		int factorial = 1;
		for(int i=1; i<=number; i++) {
			factorial = factorial * i;
			System.out.println(Thread.currentThread().getName()+" - Factorial - "+factorial);
			try {
				TimeUnit.MILLISECONDS.sleep(delay);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			synchronized (this) {
				if(shutdown) {
					System.out.println("Shutdown is true for - "+Thread.currentThread().getName());
					break;
				}
			}
		}
	}

	public void cancel() {
		System.out.println("cancel() is called for - "+Thread.currentThread().getName());

		synchronized(this) {
			shutdown = true;
		}
	}
}

public class TerminatingExecutorThreadDemo1 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		TerminatingExecutorThreadTask1 task1 = new TerminatingExecutorThreadTask1(5, 200);
		TerminatingExecutorThreadTask1 task2 = new TerminatingExecutorThreadTask1(10, 500);
		TerminatingExecutorThreadTask1 task3 = new TerminatingExecutorThreadTask1(20, 800);

		executorService.submit(task1);
		executorService.submit(task2);
		executorService.submit(task3);

		try {
			Thread.sleep(3000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		task1.cancel();
		task2.cancel();
		task3.cancel();

		executorService.shutdown();
	}
}