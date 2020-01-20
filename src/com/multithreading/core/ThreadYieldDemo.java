package com.multithreading.core;

class FirstTask extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			Thread.yield();
			System.out.println("First Task - "+i);
		}
	}
}

class SecondTask extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			Thread.yield();
			System.out.println("Second Task - "+i);
		}
	}
}

public class ThreadYieldDemo {
	public static void main(String[] args) {
		Thread firstTask = new FirstTask();
		firstTask.setPriority(Thread.MIN_PRIORITY);

		Thread secondTask = new SecondTask();
		secondTask.setPriority(Thread.MAX_PRIORITY);

		firstTask.start();
		secondTask.start();
	}
}