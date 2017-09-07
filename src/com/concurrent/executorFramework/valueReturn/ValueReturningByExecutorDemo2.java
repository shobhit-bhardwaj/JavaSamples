package com.concurrent.executorFramework.valueReturn;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*class MyRunnable implements Runnable {
	private int delay;

	public MyRunnable(int delay) {
		this.delay = delay;
	}

	 @Override
	public void run() {
		 try {
			TimeUnit.MILLISECONDS.sleep(delay);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}*/

public class ValueReturningByExecutorDemo2 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();

		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);

		completionService.submit(new ValueReturningByExecutorTask(2, 3, 2000));
		completionService.submit(new ValueReturningByExecutorTask(3, 4, 500));
		completionService.submit(new ValueReturningByExecutorTask(4, 5, 1000));

		//Future<?> future = executorService.submit(new MyRunnable(700));
		completionService.submit(new MyRunnable(700), 200);

		try {
			//System.out.println("Future Result - "+future.get());
			for(int i=0; i<4; i++) {
				System.out.println("Result - "+completionService.take().get());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		executorService.shutdown();
	}
}