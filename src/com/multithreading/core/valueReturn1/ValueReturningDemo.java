package com.multithreading.core.valueReturn1;

public class ValueReturningDemo {
	public static void main(String[] args) {
		System.out.println("Main Thread Start");

		ValueReturningTask task1 = new ValueReturningTask(2, 3, 100);
		ValueReturningTask task2 = new ValueReturningTask(4, 5, 3000);
		ValueReturningTask task3 = new ValueReturningTask(6, 8, 1000);
		Thread thread1 = new Thread(task1, "myThread-1");
		Thread thread2 = new Thread(task2, "myThread-2");
		Thread thread3 = new Thread(task3, "myThread-3");

		thread1.start();
		thread2.start();
		thread3.start();

		System.out.println("Result 1 - "+task1.getSum());
		System.out.println("Result 2 - "+task2.getSum());
		System.out.println("Result 3 - "+task3.getSum());

		System.out.println("Main Thread Done");
	}
}