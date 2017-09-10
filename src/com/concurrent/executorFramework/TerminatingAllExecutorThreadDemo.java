package com.concurrent.executorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class TerminatingAllExecutorThreadRunnableTask implements Runnable {
	private int number;
	private int delay;

	private volatile boolean shutdown;

	public TerminatingAllExecutorThreadRunnableTask(int number, int delay) {
		this.number = number;
		this.delay = delay;
	}

	@Override
	public void run() {
		int factorial = 1;
		for(int i=1; i<=number; i++) {
			factorial = factorial * i;
			System.out.println(Thread.currentThread().getName()+" - Factorial - "+factorial);
			try {
				TimeUnit.MILLISECONDS.sleep(delay);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

			synchronized (this) {
				if(shutdown) {
					System.out.println("Shutdown is true for - "+Thread.currentThread().getName());
					break;
				}
			}
		}
	}
}

class TerminatingAllExecutorThreadCallableTask implements Callable<Integer> {
	private int number;
	private int delay;

	public TerminatingAllExecutorThreadCallableTask(int number, int delay) {
		this.number = number;
		this.delay = delay;
	}

	@Override
	public Integer call() {
		int factorial = 1;
		for(int i=1; i<=number; i++) {
			factorial = factorial * i;
			System.out.println(Thread.currentThread().getName()+" - Factorial - "+factorial);
			try {
				TimeUnit.MILLISECONDS.sleep(delay);
			} catch (Exception ex) {
				ex.printStackTrace();
				//break;
			}
		}

		return factorial;
	}
}

public class TerminatingAllExecutorThreadDemo {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		TerminatingAllExecutorThreadRunnableTask task1 = new TerminatingAllExecutorThreadRunnableTask(5, 200);
		TerminatingAllExecutorThreadRunnableTask task2 = new TerminatingAllExecutorThreadRunnableTask(10, 500);

		TerminatingAllExecutorThreadCallableTask task3 = new TerminatingAllExecutorThreadCallableTask(20, 800);
		TerminatingAllExecutorThreadCallableTask task4 = new TerminatingAllExecutorThreadCallableTask(22, 900);
		TerminatingAllExecutorThreadCallableTask task5 = new TerminatingAllExecutorThreadCallableTask(25, 1000);

		executorService.execute(task1);
		executorService.execute(task2);
		Future<Integer> future3 = executorService.submit(task3);
		Future<Integer> future4 = executorService.submit(task4);
		Future<Integer> future5 = executorService.submit(task5);

		try {
			Thread.sleep(5000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		executorService.shutdownNow();

		try {
			System.out.println("Await Termination for All Tasks - "+executorService.awaitTermination(10, TimeUnit.SECONDS));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}