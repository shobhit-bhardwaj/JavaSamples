package com.concurrent.executorFramework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class TerminatingExecutorThreadTask2 implements Callable<Integer> {
	private int number;
	private int delay;

	public TerminatingExecutorThreadTask2(int number, int delay) {
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
				break;
			}

			/*if(Thread.interrupted()) {
				System.out.println(Thread.currentThread().getName()+" - is Interrupted Now.");
				break;
			}*/
		}

		return factorial;
	}
}

public class TerminatingExecutorThreadDemo2 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		TerminatingExecutorThreadTask2 task1 = new TerminatingExecutorThreadTask2(5, 200);
		TerminatingExecutorThreadTask2 task2 = new TerminatingExecutorThreadTask2(10, 500);
		TerminatingExecutorThreadTask2 task3 = new TerminatingExecutorThreadTask2(20, 800);

		Future<Integer> future1 = executorService.submit(task1);
		Future<Integer> future2 = executorService.submit(task2);
		Future<Integer> future3 = executorService.submit(task3);

		try {
			Thread.sleep(3000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Interrupting Thread Thread-1");
		future1.cancel(true);

		System.out.println("Interrupting Thread Thread-2");
		future2.cancel(true);

		System.out.println("Interrupting Thread Thread-3");
		future3.cancel(true);

		executorService.shutdown();
	}
}