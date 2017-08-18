package com.concurrent.executorFramework;

import java.util.concurrent.CyclicBarrier;

class CyclicBarrierRunnable extends Thread {
	CyclicBarrier barrier1;
	CyclicBarrier barrier2;

	public CyclicBarrierRunnable(CyclicBarrier barrier1, CyclicBarrier barrier2) {
		this.barrier1 = barrier1;
		this.barrier2 = barrier2;
	}

	@Override
	public void run() {
		try {
			System.out.println("CyclicBarrierRunnable Start");

			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" Waiting at Barrier 1");
			barrier1.await();
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" Waiting at Barrier 2");
			barrier2.await();

			System.out.println("CyclicBarrierRunnable End");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class CyclicBarrierTest {
	public static void main(String[] args) {
		System.out.println("Cyclic Barrier Test Start");

		Runnable barrierAction1 = () -> {
			System.out.println("Barrier Action 1 Executed");
		};
		Runnable barrierAction2 = () -> {
			System.out.println("Barrier Action 2 Executed");
		};

		CyclicBarrier barrier1 = new CyclicBarrier(2, barrierAction1);
		CyclicBarrier barrier2 = new CyclicBarrier(2, barrierAction2);

		CyclicBarrierRunnable barrierRunnable1 = new CyclicBarrierRunnable(barrier1, barrier2);
		CyclicBarrierRunnable barrierRunnable2 = new CyclicBarrierRunnable(barrier1, barrier2);
		barrierRunnable1.start();
		barrierRunnable2.start();

		System.out.println("Cyclic Barrier Test End");
	}
}