package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class SimpleNumberPrinterTask implements Runnable {
	private CountDownLatch latch;
	private int delay;

	public SimpleNumberPrinterTask(CountDownLatch latch, int delay) {
		this.latch = latch;
		this.delay = delay;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(Thread.currentThread().getName()+" - counter - "+i);
			try {
				TimeUnit.MILLISECONDS.sleep(delay);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		if(latch != null) {
			latch.countDown();
			System.out.println("Updated Latch Count - "+latch.getCount());
		}
	}
}

public class CountDownLatchExecutorDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Thread Start");

		CountDownLatch latch = new CountDownLatch(4);
		//CountDownLatch latch = new CountDownLatch(2);

		ExecutorService executorService = Executors.newCachedThreadPool();
		executorService.submit(new SimpleNumberPrinterTask(latch, 300));
		executorService.submit(new SimpleNumberPrinterTask(latch, 2000));
		executorService.submit(new SimpleNumberPrinterTask(latch, 500));
		executorService.submit(new SimpleNumberPrinterTask(latch, 1000));

		//executorService.submit(new SimpleNumberPrinterTask(500));
		//executorService.submit(new SimpleNumberPrinterTask(1000));

		latch.await();
		System.out.println("Latch Await Time is Over.");

		executorService.shutdown();

		System.out.println("Main Thread End");
	}
}