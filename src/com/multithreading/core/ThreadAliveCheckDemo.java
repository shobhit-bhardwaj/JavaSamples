package com.multithreading.core;

import java.util.concurrent.TimeUnit;

class ThreadAliveTask implements Runnable {
	private int delay;

	public ThreadAliveTask(int delay) {
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

public class ThreadAliveCheckDemo {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new ThreadAliveTask(300), "MyThread-1");
		Thread thread2 = new Thread(new ThreadAliveTask(500), "MyThread-2");

		boolean aliveThread1 = thread1.isAlive();
		boolean aliveThread2 = thread2.isAlive();
		System.out.println("Initially Thread1 Alive - "+aliveThread1);
		System.out.println("Initially Thread2 Alive - "+aliveThread2);

		thread1.start();
		thread2.start();

		while(true) {
			try {
				TimeUnit.MILLISECONDS.sleep(700);

				aliveThread1 = thread1.isAlive();
				aliveThread2 = thread2.isAlive();

				System.out.println("Thread1 Alive Status - "+aliveThread1);
				System.out.println("Thread2 Alive Status - "+aliveThread2);

				if(aliveThread1 == false && aliveThread2 == false)
					break;
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}