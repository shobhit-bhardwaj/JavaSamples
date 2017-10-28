package com.threads;

class BufferEvenOdd {
	private boolean even = false;

	public synchronized void printEven(int number) {
		if(even) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Even - "+number);
		even = true;
		notify();
	}

	public synchronized void printOdd(int number) {
		if(!even) {
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Odd - "+number);
		even = false;
		notify();
	}
}

class EvenGenerator extends Thread {
	private BufferEvenOdd buffer;

	public EvenGenerator(BufferEvenOdd buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for(int i=0; i<=10; i+=2)
			buffer.printEven(i);
	}
}

class OddGenerator extends Thread {
	private BufferEvenOdd buffer;

	public OddGenerator(BufferEvenOdd buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for(int i=1; i<=9; i+=2)
			buffer.printOdd(i);
	}
}

public class EvenOddGenerator {
	public static void main(String[] args) {
		BufferEvenOdd buffer = new BufferEvenOdd();
		new EvenGenerator(buffer).start();
		new OddGenerator(buffer).start();
	}
}