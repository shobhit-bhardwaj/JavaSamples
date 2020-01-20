package com.multithreading.core.valueReturn1;

import java.util.concurrent.TimeUnit;

public class ValueReturningTask implements Runnable {
	private int a;
	private int b;
	private long delay;
	private int sum;

	private volatile boolean done = false;

	public ValueReturningTask(int a, int b, long delay) {
		this.a = a;
		this.b = b;
		this.delay = delay;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" has Started Working.");

		try {
			TimeUnit.MILLISECONDS.sleep(delay);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		sum = a+b;

		done = true;

		synchronized (this) {
			System.out.println(Thread.currentThread().getName()+" notifying Thread");
			this.notify();
		}

		System.out.println(Thread.currentThread().getName()+" has Done.");
	}

	public int getSum() {
		if(!done) {
			synchronized (this) {
				System.out.println(Thread.currentThread().getName()+" Waiting to be Processed");

				try {
					this.wait();
				} catch (Exception ex) {
					ex.printStackTrace();
				}

				System.out.println(Thread.currentThread().getName()+" Processed");
			}
		}

		return sum;
	}
}