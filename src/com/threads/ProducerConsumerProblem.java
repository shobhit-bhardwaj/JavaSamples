package com.threads;

class Buffer {
	private boolean isProduced = false;

	public synchronized void produce(int number) {
		if(isProduced) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		System.out.println("Producing - "+number);
		isProduced = true;
		notify();
	}

	public synchronized int consume(int number) {
		if(!isProduced) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		System.out.println("Consuming - "+number);
		isProduced = false;
		notify();

		return number;
	}
}

class ProducerThread implements Runnable {
	private Buffer buffer;
	private int number;

	public ProducerThread(Buffer buffer, int number) {
		this.buffer = buffer;
		this.number = number;
	}

	@Override
	public void run() {
		buffer.produce(number);
	}
}

class ConsumerThread implements Runnable {
	private Buffer buffer;
	private int number;

	public ConsumerThread(Buffer buffer, int number) {
		this.buffer = buffer;
		this.number = number;
	}

	@Override
	public void run() {
		buffer.consume(number);
	}
}

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		Buffer buffer = new Buffer();

		for(int i=1; i<=10; i++) {
			new Thread(new ProducerThread(buffer, i)).start();
			new Thread(new ConsumerThread(buffer, i)).start();
		}
	}
}