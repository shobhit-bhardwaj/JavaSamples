package com.multithreading.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class ProducerThread extends Thread {
	private BlockingQueue<Integer> queue;

	public ProducerThread(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				queue.put(i);
				System.out.println("Produced - "+i);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

class ConsumerThread extends Thread {
	private BlockingQueue<Integer> queue;

	public ConsumerThread(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				int data = queue.take();
				System.out.println("Consumed - "+data);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

public class ProducerConsumerProblemByBlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
		new ProducerThread(queue).start();
		new ConsumerThread(queue).start();
	}
}