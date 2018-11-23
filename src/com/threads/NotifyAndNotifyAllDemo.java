package com.threads;

import java.util.concurrent.TimeUnit;

class WaitNotifyTask {
	public synchronized void waitMethod() {
		try {
			System.out.println(Thread.currentThread().getName()+" - waitMethod Start.");
			wait();
			System.out.println(Thread.currentThread().getName()+" - waitMethod End.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
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
	public static void main(String[] args) throws Exception {
		WaitNotifyTask task = new WaitNotifyTask();

		new Thread(() -> { task.waitMethod(); }, "Thread 1").start();
		new Thread(() -> { task.waitMethod(); }, "Thread 2").start();
		new Thread(() -> { task.waitMethod(); }, "Thread 3").start();

		TimeUnit.SECONDS.sleep(1);

		new Thread(() -> { task.notifyMethod(); }, "Thread 4").start();
		//new Thread(() -> { task.notifyAllMethod(); }, "Thread 4").start();
	}
}