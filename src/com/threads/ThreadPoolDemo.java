package com.threads;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class ThreadPool {
	private final int noOfThreads;
	private final LinkedBlockingQueue<Runnable> queue;
	private final PoolThread[] poolThread;

	public ThreadPool(int noOfThreads) {
		this.noOfThreads = noOfThreads;
		queue = new LinkedBlockingQueue<>();
		poolThread = new PoolThread[noOfThreads];

		for(int i=0; i<this.noOfThreads; i++) {
			poolThread[i] = new PoolThread();
			poolThread[i].start();
		}
	}

	public void execute(Runnable task) {
		synchronized (queue) {
			queue.add(task);
			queue.notify();
		}
	}

	private class PoolThread extends Thread {
		@Override
		public void run() {
			Runnable task;

			while(true) {
				synchronized (queue) {
					while(queue.isEmpty()) {
						try {
							queue.wait();
						} catch (Exception ex) {
							ex.printStackTrace();
						}
					}
					task = queue.poll();
				}

				try {
					task.run();
				} catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		}
	}
}

public class ThreadPoolDemo {
	public static void main(String[] args) {
		ThreadPool threadPool = new ThreadPool(5);
		for(int i=1; i<=10; i++) {
			Thread thread = new Thread("Thread "+i) {
				public void run() {
					try {
						System.out.println("Executing Task - "+Thread.currentThread().getName());
						TimeUnit.SECONDS.sleep(3);
						System.out.println("Executed Task - "+Thread.currentThread().getName());
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				};
			};
			threadPool.execute(thread);
		}
	}
}