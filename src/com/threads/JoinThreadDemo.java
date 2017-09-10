package com.threads;

import java.util.concurrent.TimeUnit;

class JoinThreadTask implements Runnable {
	private int delay;

	public JoinThreadTask(int delay) {
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
	}
}

public class JoinThreadDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Thread Start");

		Thread thread1 = new Thread(new JoinThreadTask(500), "MyThread-1");
		Thread thread2 = new Thread(new JoinThreadTask(200), "MyThread-2");
		Thread thread3 = new Thread(new JoinThreadTask(300), "MyThread-3");
		thread1.start();
		thread2.start();
		thread3.start();

		thread1.join();
		System.out.println("Joining MyThread-1.");

		thread2.join();
		System.out.println("Joining MyThread-2.");

		thread3.join();
		System.out.println("Joining MyThread-3.");

		System.out.println("Main Thread End");
	}
}