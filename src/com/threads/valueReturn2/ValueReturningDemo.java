package com.threads.valueReturn2;

public class ValueReturningDemo {
	public static void main(String[] args) {
		System.out.println("Main Thread Start");

		ValueProvider<Integer> sumProvider = new SumProvider();
		ValueReturningTask task1 = new ValueReturningTask(2, 3, 100, sumProvider);
		ValueReturningTask task2 = new ValueReturningTask(4, 5, 3000, sumProvider);
		ValueReturningTask task3 = new ValueReturningTask(6, 8, 1000, sumProvider);
		Thread thread1 = new Thread(task1, "myThread-1");
		Thread thread2 = new Thread(task2, "myThread-2");
		Thread thread3 = new Thread(task3, "myThread-3");

		thread1.start();
		thread2.start();
		thread3.start();

		System.out.println("Main Thread Done");
	}
}