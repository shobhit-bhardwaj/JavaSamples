package com.multithreading;

import java.util.concurrent.TimeUnit;

class BufferEvenOdd {
	private volatile boolean even = false;

	public synchronized void printEven(int number) {
		while (even) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Even - " + number);
		even = true;
		notifyAll();
	}

	public synchronized void printOdd(int number) {
		while (!even) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Odd - " + number);
		even = false;
		notifyAll();
	}
}

class EvenGenerator extends Thread {
	private BufferEvenOdd buffer;
	private int number;

	public EvenGenerator(BufferEvenOdd buffer, int number) {
		this.buffer = buffer;
		this.number = number;
	}

	@Override
	public void run() {
		buffer.printEven(number);
	}
}

class OddGenerator extends Thread {
	private BufferEvenOdd buffer;
	private int number;

	public OddGenerator(BufferEvenOdd buffer, int number) {
		this.buffer = buffer;
		this.number = number;
	}

	@Override
	public void run() {
		buffer.printOdd(number);
	}
}

public class EvenOddGenerator {
	public static void main(String[] args) throws Exception {
		BufferEvenOdd buffer = new BufferEvenOdd();

		for(int i=0; i<=10; i+=2)
			new EvenGenerator(buffer, i).start();

		TimeUnit.SECONDS.sleep(1);

		for(int i=1; i<=9; i+=2)
			new OddGenerator(buffer, i).start();
	}
}