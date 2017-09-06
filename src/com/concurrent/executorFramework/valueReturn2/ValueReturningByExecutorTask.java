package com.concurrent.executorFramework.valueReturn2;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class ValueReturningByExecutorTask implements Callable<Integer> {
	private int a;
	private int b;
	private int delay;

	public ValueReturningByExecutorTask(int a, int b, int delay) {
		this.a = a;
		this.b = b;
		this.delay = delay;
	}

	@Override
	public Integer call() throws Exception {
		TimeUnit.MILLISECONDS.sleep(delay);

		return a+b;
	}
}