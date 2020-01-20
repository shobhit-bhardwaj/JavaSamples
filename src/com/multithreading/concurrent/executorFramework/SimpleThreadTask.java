package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.TimeUnit;

public class SimpleThreadTask implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" - SimpleThreadTask Start");

		for(int i=1; i<=10; i++) {
			try {
				TimeUnit.MILLISECONDS.sleep((long) (Math.random()*1000));
				System.out.println(Thread.currentThread().getName()+" - Tick Tick "+i);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}

		System.out.println(Thread.currentThread().getName()+" - SimpleThreadTask Done");
	}
}