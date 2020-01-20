package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

class DaemonThreadFactory implements ThreadFactory {
	private static int threadCounter = 0;

	@Override
	public Thread newThread(Runnable runnable) {
		Thread thread = null;
		if(threadCounter%2 == 0) {
			thread = new Thread(runnable, "MAIN-Thread-"+threadCounter);
		} else {
			thread = new Thread(runnable, "DAEMON-Thread-"+threadCounter);
			thread.setDaemon(true);
		}
		threadCounter++;

		return thread;
	}
}

class DaemonThreadTask implements Runnable {
	private int delay;

	public DaemonThreadTask(int delay) {
		this.delay = delay;
	}

	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			try {
				System.out.println(Thread.currentThread().getName()+" - Counter - "+i);
				TimeUnit.MILLISECONDS.sleep(delay);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

public class DaemonThreadByExecutorDemo {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool(new DaemonThreadFactory());
		executorService.execute(new DaemonThreadTask(200));
		executorService.execute(new DaemonThreadTask(500));

		//	Validate the Cached Thread Pool
		/*try {
			TimeUnit.SECONDS.sleep(10);
		} catch (Exception ex) {
			ex.printStackTrace();
		}*/

		executorService.execute(new DaemonThreadTask(300));
		executorService.execute(new DaemonThreadTask(700));

		executorService.shutdown();
	}
}