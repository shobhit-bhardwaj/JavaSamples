package com.threads;

import java.util.concurrent.TimeUnit;

class VolatileTask implements Runnable {
	//private boolean running = true;	//	Sometimes Cached value is not Reset in Some OS
	private volatile boolean running = true;	//	To Avoid This, Use volatile Keyword

	@Override
	public void run() {
		while(running) {
			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			System.out.println("Counting");
		}
	}

	public void shutdown() {
		running = false;
	}
}

public class VolatileDemo {
	public static void main(String[] args) {
		VolatileTask task = new VolatileTask();
		Thread thread = new Thread(task);
		thread.start();

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Calling Shutdown in Current Thread");
		task.shutdown();
	}
}