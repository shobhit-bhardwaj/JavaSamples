package com.threads;

import java.util.concurrent.TimeUnit;

class MyThreadByClass extends Thread {
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

public class SimpleThreadCreationByClass {
	public static void main(String[] args) {
		System.out.println("Main Thread Start");

		MyThreadByClass thread1 = new MyThreadByClass();
		MyThreadByClass thread2 = new MyThreadByClass();
		thread1.start();
		thread2.start();

		System.out.println("Main Thread Done");
	}
}