package com.threads;

class BufferOneTwoThree {
	private int semaphore = 1;

	public synchronized void printOne(int number) {
		if(semaphore == 2 || semaphore == 3) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Print - "+number);
		semaphore = 2;
		notifyAll();
	}

	public synchronized void printTwo(int number) {
		if(semaphore == 1 || semaphore == 3) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Print - "+number);
		semaphore = 3;
		notifyAll();
	}

	public synchronized void printThree(int number) {
		if(semaphore == 1 || semaphore == 2) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Print - "+number);
		semaphore = 1;
		notifyAll();
	}
}

class OneGenerator extends Thread {
	private BufferOneTwoThree buffer;

	public OneGenerator(BufferOneTwoThree buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		buffer.printOne(1);
	}
}

class TwoGenerator extends Thread {
	private BufferOneTwoThree buffer;

	public TwoGenerator(BufferOneTwoThree buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		buffer.printTwo(2);
	}
}

class ThreeGenerator extends Thread {
	private BufferOneTwoThree buffer;

	public ThreeGenerator(BufferOneTwoThree buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		buffer.printThree(3);
	}
}

public class OneTwoThreeGenerator {
	public static void main(String[] args) {
		BufferOneTwoThree buffer = new BufferOneTwoThree();
		for(int i=1; i<=10; i++) {
			new OneGenerator(buffer).start();
			new TwoGenerator(buffer).start();
			new ThreeGenerator(buffer).start();
		}
	}
}