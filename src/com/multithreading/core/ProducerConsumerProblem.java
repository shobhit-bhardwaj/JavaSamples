package com.multithreading;

class BufferProducerConsumer {
	private boolean isProduced = false;

	public synchronized void produce(int number) {
		while (isProduced) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		System.out.println("Producing - "+number);
		isProduced = true;
		notifyAll();
	}

	public synchronized int consume(int number) {
		while (!isProduced) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		System.out.println("Consuming - "+number);
		isProduced = false;
		notifyAll();

		return number;
	}
}

class ProducerThread implements Runnable {
	private BufferProducerConsumer buffer;
	private int number;

	public ProducerThread(BufferProducerConsumer buffer, int number) {
		this.buffer = buffer;
		this.number = number;
	}

	@Override
	public void run() {
		buffer.produce(number);
	}
}

class ConsumerThread implements Runnable {
	private BufferProducerConsumer buffer;
	private int number;

	public ConsumerThread(BufferProducerConsumer buffer, int number) {
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
		BufferProducerConsumer buffer = new BufferProducerConsumer();

		for(int i=1; i<=10; i++) {
			new Thread(new ProducerThread(buffer, i)).start();
			new Thread(new ConsumerThread(buffer, i)).start();
		}
	}
}