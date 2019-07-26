package com.multithreading.valueReturn2;

import java.util.concurrent.TimeUnit;

public class ValueReturningTask implements Runnable {
	private int a;
	private int b;
	private int sum;
	private int delay;
	private ValueProvider<Integer> valueProvider;

	public ValueReturningTask(int a, int b, int delay, ValueProvider<Integer> valueProvider) {
		this.a = a;
		this.b = b;
		this.delay = delay;
		this.valueProvider = valueProvider;
	}

	@Override
	public void run() {
		try {
			TimeUnit.MILLISECONDS.sleep(delay);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}

		sum = a+b;

		valueProvider.printValue(sum);
	}
}