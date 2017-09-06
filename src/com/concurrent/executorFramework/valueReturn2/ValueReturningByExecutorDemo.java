package com.concurrent.executorFramework.valueReturn2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class MyRunnable implements Runnable {
	private int delay;

	public MyRunnable(int delay) {
		this.delay = delay;
	}

	 @Override
	public void run() {
		 try {
			TimeUnit.MILLISECONDS.sleep(delay);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

public class ValueReturningByExecutorDemo {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<Integer> future1 = executorService.submit(new ValueReturningByExecutorTask(2, 3, 2000));
		Future<Integer> future2 = executorService.submit(new ValueReturningByExecutorTask(3, 4, 500));
		Future<Integer> future3 = executorService.submit(new ValueReturningByExecutorTask(4, 5, 1000));

		Future<?> future4 = executorService.submit(new MyRunnable(700));
		Future<Integer> future5 = executorService.submit(new MyRunnable(700), 200);

		try {
			System.out.println("Result 1 - "+future1.get());
			System.out.println("Result 2 - "+future2.get());
			System.out.println("Result 3 - "+future3.get());
			System.out.println("Result 4 - "+future4.get());
			System.out.println("Result 5 - "+future5.get());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		executorService.shutdown();
	}
}