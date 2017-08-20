package com.threads;

import java.util.concurrent.TimeUnit;

class MyThreadByRunnable implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				TimeUnit.MILLISECONDS.sleep(200);
				System.out.println("Tick Tick "+i);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}

public class SimpleThreadCreationByRunnable {
	public static void main(String[] args) {
		System.out.println("Main Thread Start");

		MyThreadByRunnable thread1 = new MyThreadByRunnable();
		MyThreadByRunnable thread2 = new MyThreadByRunnable();
		new Thread(thread1).start();
		new Thread(thread2).start();

		System.out.println("Main Thread Done");
	}
}