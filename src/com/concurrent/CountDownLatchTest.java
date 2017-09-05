package com.concurrent;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


class Waiter extends Thread {
	private CountDownLatch latch;

	public Waiter(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		System.out.println("Waiter await() Start");
		try {
			latch.await();
			//latch.await(2, TimeUnit.SECONDS);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Waiter await() End");
	}
}

class Decrementer extends Thread {
	private CountDownLatch latch;

	public Decrementer(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			latch.countDown();
			System.out.println("Count Down Sleep 1, latch.getCount() - "+latch.getCount());

			Thread.sleep(1000);
			latch.countDown();
			System.out.println("Count Down Sleep 2, latch.getCount() - "+latch.getCount());

			Thread.sleep(1000);
			latch.countDown();
			System.out.println("Count Down Sleep 3, latch.getCount() - "+latch.getCount());

			Thread.sleep(1000);
			latch.countDown();
			System.out.println("Count Down Sleep 4, latch.getCount() - "+latch.getCount());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class CountDownLatchTest {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Thread Sleep Start");

		CountDownLatch latch = new CountDownLatch(3);
		Waiter waiter = new Waiter(latch);
		Decrementer decrementer = new Decrementer(latch);
		waiter.start();
		decrementer.start();
		System.out.println("Main Thread Sleep End");
	}
}