package com.threads;

import java.util.concurrent.TimeUnit;

class ValueReturnTask implements Runnable {
	private int a;
	private int b;
	private int delay;

	private int sum;

	public ValueReturnTask(int a, int b, int delay) {
		this.a = a;
		this.b = b;
		this.delay = delay;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" has Started Working.");

		try {
			TimeUnit.MILLISECONDS.sleep(delay);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		sum = a+b;

		System.out.println(Thread.currentThread().getName()+" has Done.");
	}

	public int getSum() {
		return sum;
	}
}

public class ValueReturnByJoinDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Thread Start");

		ValueReturnTask task1 = new ValueReturnTask(2, 3, 2000);
		ValueReturnTask task2 = new ValueReturnTask(3, 6, 500);
		ValueReturnTask task3 = new ValueReturnTask(7, 9, 1000);

		Thread thread1 = new Thread(task1, "MyThread-1");
		Thread thread2 = new Thread(task2, "MyThread-2");
		Thread thread3 = new Thread(task3, "MyThread-3");

		thread1.start();
		thread2.start();
		thread3.start();

		thread1.join();
		thread2.join();
		thread3.join();

		System.out.println("Sum Result MyThread-1 - "+task1.getSum());
		System.out.println("Sum Result MyThread-2 - "+task2.getSum());
		System.out.println("Sum Result MyThread-3 - "+task3.getSum());

		System.out.println("Main Thread End");
	}
}