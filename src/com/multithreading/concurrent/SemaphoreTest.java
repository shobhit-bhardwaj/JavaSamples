package com.multithreading.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreTest {
	private static class Worker {
		private Semaphore semaphore = new Semaphore(3);

		public void downloadData() {
			try {
				semaphore.acquire();
				System.out.println("Downloading acquired by Thread - " + Thread.currentThread().getName());

				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			} finally {
				semaphore.release();
			}

			System.out.println("Downloading released by Thread - " + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		Worker worker = new Worker();
		ExecutorService service = Executors.newCachedThreadPool();

		for(int i=0; i<10; i++)
			service.execute(() -> worker.downloadData());

		service.shutdown();
	}
}