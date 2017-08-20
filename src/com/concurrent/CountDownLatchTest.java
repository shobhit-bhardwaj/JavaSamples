package com.concurrent;

import java.util.concurrent.CountDownLatch;


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
			System.out.println("Count Down Sleep 1");

			Thread.sleep(1000);
			latch.countDown();
			System.out.println("Count Down Sleep 2");

			Thread.sleep(1000);
			latch.countDown();
			System.out.println("Count Down Sleep 3");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class CountDownLatchTest {
	public static void main(String[] args) throws Exception {
		CountDownLatch latch = new CountDownLatch(3);

		Waiter waiter = new Waiter(latch);
		Decrementer decrementer = new Decrementer(latch);
		waiter.start();
		decrementer.start();
		System.out.println("Maid Thread Sleep Start");
		Thread.sleep(5000);
		System.out.println("Maid Thread Sleep End");
	}
}