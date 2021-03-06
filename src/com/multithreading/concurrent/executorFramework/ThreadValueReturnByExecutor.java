package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadValueReturnByExecutor {
	private static class SimpleRunnable implements Runnable {
		private int delay;

		public SimpleRunnable(int delay) {
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

	private static class SimpleCallable implements Callable<Integer> {
		private int a;
		private int b;
		private int delay;

		public SimpleCallable(int a, int b, int delay) {
			this.a = a;
			this.b = b;
			this.delay = delay;
		}

		@Override
		public Integer call() throws Exception {
			TimeUnit.MILLISECONDS.sleep(delay);

			return a + b;
		}
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();

		Future<Integer> future1 = executorService.submit(new SimpleCallable(2, 3, 2000));
		Future<Integer> future2 = executorService.submit(new SimpleCallable(3, 4, 500));
		Future<Integer> future3 = executorService.submit(new SimpleCallable(4, 5, 1000));

		Future<?> future4 = executorService.submit(new SimpleRunnable(700));
		Future<Integer> future5 = executorService.submit(new SimpleRunnable(700), 200);

		try {
			System.out.println("Result 1 - " + future1.get());
			System.out.println("Result 2 - " + future2.get());
			System.out.println("Result 3 - " + future3.get());
			System.out.println("Result 4 - " + future4.get());
			System.out.println("Result 5 - " + future5.get());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		executorService.shutdown();
	}
}