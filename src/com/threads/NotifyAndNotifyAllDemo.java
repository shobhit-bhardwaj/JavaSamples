package com.threads;

import java.util.concurrent.TimeUnit;

class WaitNotifyTask {
	public synchronized void waitMethod() {
		System.out.println(Thread.currentThread().getName()+" - waitMethod Start.");
		try {
			wait();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" - waitMethod End.");
	}

	public synchronized void notifyMethod() {
		notify();
		System.out.println(Thread.currentThread().getName()+" - notifyMethod Called.");
	}

	public synchronized void notifyAllMethod() {
		notifyAll();
		System.out.println(Thread.currentThread().getName()+" - notifyAllMethod Called.");
	}
}

public class NotifyAndNotifyAllDemo {
	public static void main(String[] args) {
		WaitNotifyTask task = new WaitNotifyTask();

		Thread thread1 = new Thread("Thread 1") {
			public void run() {
				task.waitMethod();
			};
		};
		thread1.start();

		Thread thread2 = new Thread("Thread 2") {
			public void run() {
				task.waitMethod();
			};
		};
		thread2.start();

		Thread thread3 = new Thread("Thread 3") {
			public void run() {
				task.waitMethod();
			};
		};
		thread3.start();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		Thread thread4 = new Thread("Thread 4") {
			public void run() {
				//task.notifyMethod();
				task.notifyAllMethod();
			};
		};
		thread4.start();
	}
}