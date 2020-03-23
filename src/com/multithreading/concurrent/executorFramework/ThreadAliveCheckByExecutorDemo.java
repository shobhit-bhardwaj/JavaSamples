package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ThreadAliveCheckByExecutorDemo {
	private static class SimpleRunnable implements Runnable {
		private int delay;

		public SimpleRunnable(int delay) {
			this.delay = delay;
		}

		@Override
		public void run() {
			try {
				System.out.println("SimpleCallable Thread running by Thread - " + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(delay);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		SimpleRunnable runnable1 = new SimpleRunnable(4);
		SimpleRunnable runnable2 = new SimpleRunnable(7);

		ExecutorService service = Executors.newCachedThreadPool();
		Future<?> future1 = service.submit(runnable1);
		Future<Integer> future2 = service.submit(runnable2, 100);

		while(true) {
			TimeUnit.MILLISECONDS.sleep(500);

			boolean done1 = future1.isDone();
			boolean done2 = future2.isDone();

			System.out.println("First Task Done - " + done1);
			System.out.println("Second Task Done - " + done2);

			if(done1 && done2)
				break;
		}

		System.out.println("Both Task Completed.");
		System.out.println("First Task Returns - " + future1.get());
		System.out.println("Second Task Returns - " + future2.get());

		service.shutdown();
	}
}