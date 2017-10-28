package com.threads;

import java.util.concurrent.TimeUnit;

class BufferSynchronized {
	//private static Object object = new Object();
	//private Object object = new Object();

	public void abc() throws Exception {
		//synchronized (object) {
		//synchronized (this) {
		synchronized (BufferSynchronized.class) {
			System.out.println("abc() - "+Thread.currentThread().getName()+" Start");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("abc() - "+Thread.currentThread().getName()+" End");
		}
	}
}

class A extends Thread {
	private BufferSynchronized buffer;

	public A(BufferSynchronized buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		try {
			buffer.abc();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class ObjectClassLevelSynchronization {
	public static void main(String[] args) {
		BufferSynchronized buffer1 = new BufferSynchronized();
		A a1 = new A(buffer1);
		a1.setName("a1");
		a1.start();

		BufferSynchronized buffer2 = new BufferSynchronized();
		A a2 = new A(buffer2);
		a2.setName("a2");
		a2.start();
	}
}