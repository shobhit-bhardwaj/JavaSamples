package com.threads;

import java.util.concurrent.TimeUnit;

class DaemonThreadTask implements Runnable {
	private int delay;

	public DaemonThreadTask(int delay) {
		this.delay = delay;
	}

	@Override
	public void run() {
		String isDaemon = Thread.currentThread().isDaemon() ? "DAEMON" : "MAIN";
		System.out.println(Thread.currentThread().getName()+" Nature - "+isDaemon);

		for(int i=1; i<=10; i++) {
			try {
				System.out.println(isDaemon+" :- "+Thread.currentThread().getName()+" - Counter - "+i);
				TimeUnit.MILLISECONDS.sleep(delay);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

public class DaemonThreadDemo {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new DaemonThreadTask(200));
		Thread thread2 = new Thread(new DaemonThreadTask(500));
		thread2.setDaemon(true);

		thread1.start();
		thread2.start();
	}
}