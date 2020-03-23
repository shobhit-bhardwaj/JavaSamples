package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierExecutorDemo {
	private static class SimpleThread implements Runnable {
		private CyclicBarrier cyclicBarrier;

		public SimpleThread(CyclicBarrier cyclicBarrier) {
			this.cyclicBarrier = cyclicBarrier;
		}

		@Override
		public void run() {
			try {
				System.out.println("SimpleThread Started by Thread - " + Thread.currentThread().getName());
				cyclicBarrier.await();
			} catch (BrokenBarrierException | InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
			System.out.println("Barrier Action is Called.");
		});

		ExecutorService service = Executors.newCachedThreadPool();
		for(int i=0; i<9; i++) {
			service .execute(new SimpleThread(cyclicBarrier));
			TimeUnit.SECONDS.sleep(2);
		}

		service.shutdown();
	}
}