package com.multithreading;

import java.util.concurrent.TimeUnit;

class TerminatingThreadTask1 implements Runnable {
	private int delay;

	private volatile boolean shutdown = false;

	public TerminatingThreadTask1(int delay) {
		this.delay = delay;
	}

	@Override
	public void run() {
		for(int i=1;; i++) {
			try {
				System.out.println(Thread.currentThread().getName()+" - Counter - "+i);
				TimeUnit.MILLISECONDS.sleep(delay);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			synchronized(this) {
				if(shutdown) {
					System.out.println("Shutdown is true for - "+Thread.currentThread().getName());
					break;
				}
			}
		}
	}

	public void cancel() {
		System.out.println("cancel() is called for - "+Thread.currentThread().getName());

		synchronized(this) {
			shutdown = true;
		}
	}
}

public class TerminatingThreadDemo1 {
	public static void main(String[] args) {
		TerminatingThreadTask1 task1 = new TerminatingThreadTask1(200);
		TerminatingThreadTask1 task2 = new TerminatingThreadTask1(300);
		TerminatingThreadTask1 task3 = new TerminatingThreadTask1(500);

		new Thread(task1, "MyThread-1").start();
		new Thread(task2, "MyThread-2").start();
		new Thread(task3, "MyThread-3").start();

		try {
			Thread.sleep(3000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		task1.cancel();
		task2.cancel();
		task3.cancel();
	}
}