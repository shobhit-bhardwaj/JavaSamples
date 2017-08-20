package com.threads;

import java.util.concurrent.TimeUnit;

public class NamingThreadDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Thread Start");

		Thread thread1 = new Thread(new SimpleThreadTask(), "MyThread-1");
		Thread thread2 = new Thread(new SimpleThreadTask());
		thread1.start();
		thread2.start();
		TimeUnit.SECONDS.sleep(1);
		thread2.setName("MyThread-2");	//	Change the Thread Name after Running the Thread.

		System.out.println("Main Thread Done");
	}
}