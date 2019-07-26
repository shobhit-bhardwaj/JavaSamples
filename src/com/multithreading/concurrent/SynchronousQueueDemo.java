package com.multithreading.concurrent;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

class InsertionThread extends Thread {
	private SynchronousQueue<String> queue;
	private String value;

	public InsertionThread(SynchronousQueue<String> queue, String value) {
		this.queue = queue;
		this.value = value;
	}

	@Override
	public void run() {
		try {
			System.out.println("Value Putting - "+value);
			queue.put(value);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

class RemovalThread extends Thread {
	private SynchronousQueue<String> queue;

	public RemovalThread(SynchronousQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			System.out.println("Taking Value");
			String value = queue.take();
			System.out.println("Value Take - "+value);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class SynchronousQueueDemo {
	public static void main(String[] args) {
		SynchronousQueue<String> queue = new SynchronousQueue<>();
		new InsertionThread(queue, "First Value").start();
		new InsertionThread(queue, "Second Value").start();

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		new RemovalThread(queue).start();

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		new RemovalThread(queue).start();
	}
}