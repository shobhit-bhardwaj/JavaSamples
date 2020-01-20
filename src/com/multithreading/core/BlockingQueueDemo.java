package com.multithreading.core;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

class BlockingQueue {
	private List<Integer> queue = new CopyOnWriteArrayList<>();
	private int limit;

	public BlockingQueue(int limit) {
		this.limit = limit;
	}

	public synchronized void enqueue(Integer element) throws InterruptedException {
		while(queue.size() == limit) {
			wait();
		}
		if(queue.size() == 0) {
			notifyAll();
		}
		queue.add(element);
	}

	public synchronized Integer dequeue() throws InterruptedException {
		while(queue.size() == 0) {
			wait();
		}
		if(queue.size() == limit) {
			notifyAll();
		}
		return queue.remove(0);
	}

	@Override
	public String toString() {
		return queue.toString();
	}
}

class FeederTask extends Thread {
	private BlockingQueue queue;
	private int value;

	public FeederTask(BlockingQueue queue, int value) {
		this.queue = queue;
		this.value = value;
	}

	@Override
	public void run() {
		try {
			queue.enqueue(value);
			System.out.println("Value Added - "+value);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

class RemoverTask extends Thread {
	private BlockingQueue queue;

	public RemoverTask(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			int value = queue.dequeue();
			System.out.println("Value Get - "+value+" | Queue - "+queue);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class BlockingQueueDemo {
	public static void main(String[] args) {
		BlockingQueue queue = new BlockingQueue(3);

		for(int i=1; i<=10; i++) {
			new FeederTask(queue, i).start();
		}

		for(int i=1; i<=10; i++) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			new RemoverTask(queue).start();
		}
	}
}