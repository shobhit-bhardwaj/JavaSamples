package com.threads;

import java.util.concurrent.TimeUnit;

public class DaemonThreadDemo {
	private static class SimpleThread implements Runnable {
		private int delay;

		public SimpleThread(int delay) {
			this.delay = delay;
		}

		@Override
		public void run() {
			String threadName = Thread.currentThread().getName();
			String isDaemon = Thread.currentThread().isDaemon() ? "DAEMON" : "MAIN";
			System.out.println(threadName + " Nature - " + isDaemon);

			for(int i=1; i<=10; i++) {
				try {
					System.out.println(isDaemon + " :- " + threadName + " - Counter - " + i);
					TimeUnit.SECONDS.sleep(delay);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}

			System.out.println(threadName + " - Exiting");
		}
	}

	public static void main(String[] args) {
		Thread thread1 = new Thread(new SimpleThread(1));
		Thread thread2 = new Thread(new SimpleThread(2));
		thread2.setDaemon(true);

		thread1.start();
		thread2.start();
	}
}