package com.multithreading.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SynchronizedMultipleBlockDemo {
	private Random random = new Random();

	private Object lock1 = new Object();
	private Object lock2 = new Object();

	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();

	public void fillList1() {
		synchronized (lock1) {
			try {
				TimeUnit.MILLISECONDS.sleep(1);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
	}

	public void fillList2() {
		synchronized (lock2) {
			try {
				TimeUnit.MILLISECONDS.sleep(1);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
	}

	public void process() {
		for(int i=1; i<=1000; i++) {
			fillList1();
			fillList2();
		}
	}

	public static void main(String[] args) {
		SynchronizedMultipleBlockDemo test = new SynchronizedMultipleBlockDemo();

		Date startDate = new Date();

		Thread thread1 = new Thread() {
			public void run() {
				test.process();
			};
		};
		thread1.start();

		Thread thread2 = new Thread() {
			public void run() {
				test.process();
			};
		};
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		Date endDate = new Date();
		System.out.println("Time Taken - "+(startDate.getTime() - endDate.getTime()));

		System.out.println("List Sizes :- "+test.list1.size()+" - "+test.list1.size());
	}
}