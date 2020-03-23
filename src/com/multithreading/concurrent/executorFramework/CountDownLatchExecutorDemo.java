package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchExecutorDemo {
	private static class SimpleThread implements Runnable {
		private CountDownLatch countDownLatch;
		private int delay;

		public SimpleThread(CountDownLatch countDownLatch, int delay) {
			this.countDownLatch = countDownLatch;
			this.delay = delay;
		}

		@Override
		public void run() {
			try {
				System.out.println("SimpleThread Started by Thread - " + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(delay);

				System.out.println("Countdown Decresed after delay - " + delay + " - By Thread - " + Thread.currentThread().getName());
				countDownLatch.countDown();
				System.out.println("New Countdown - " + countDownLatch.getCount());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		CountDownLatch countDownLatch = new CountDownLatch(3);

		SimpleThread thread1 = new SimpleThread(countDownLatch, 3);
		SimpleThread thread2 = new SimpleThread(countDownLatch, 5);
		SimpleThread thread3 = new SimpleThread(countDownLatch, 7);

		ExecutorService service = Executors.newCachedThreadPool();
		service .execute(thread1);
		service .execute(thread2);
		service .execute(thread3);

		countDownLatch.await();
		//countDownLatch.await(6, TimeUnit.SECONDS);

		System.out.println("All Tasks Completed Successfully.");

		service.shutdown();
	}
}