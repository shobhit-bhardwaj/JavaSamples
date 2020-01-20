package com.multithreading.concurrent.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class ThreadAliveTask implements Runnable {
	private int delay;

	public ThreadAliveTask(int delay) {
		this.delay = delay;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " - counter - " + i);
			try {
				TimeUnit.MILLISECONDS.sleep(delay);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}

public class ThreadAliveCheckByExecutorDemo {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		Future<?> future1 = executorService.submit(new ThreadAliveTask(600));
		Future<Integer> future2 = executorService.submit(new ThreadAliveTask(800), 300);

		while (true) {
			System.out.println("First Task Status - " + future1.isDone());
			System.out.println("Second Task Status - " + future2.isDone());

			try {
				TimeUnit.MILLISECONDS.sleep(500);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

			if(future1.isDone() && future2.isDone())
				break;
		}

		try {
			System.out.println("Result 1 - "+future1.get());
			System.out.println("Result 2 - "+future2.get());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		executorService.shutdown();
	}
}