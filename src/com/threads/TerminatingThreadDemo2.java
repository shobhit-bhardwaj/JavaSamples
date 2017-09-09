package com.threads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class TerminatingThreadTask2 implements Runnable {
	@Override
	public void run() {
		for(int i=1;; i++) {
			System.out.println(Thread.currentThread().getName()+" - Calling doAnotherTask().");
			doAnotherTask();

			if(Thread.interrupted()) {
				System.out.println(Thread.currentThread().getName()+" - is Interrupted Now.");
				break;
			}
		}

		System.out.println(Thread.currentThread().getName()+" - is Done.");
	}

	public void doAnotherTask() {
		List<Integer> intList = new ArrayList<>();
		Random randomGenerator = new Random();
		for(int i=0; i<100000; i++)
			intList.add(randomGenerator.nextInt(100000));
		Collections.sort(intList);
	}
}

public class TerminatingThreadDemo2 {
	public static void main(String[] args) {
		TerminatingThreadTask2 task1 = new TerminatingThreadTask2();
		TerminatingThreadTask2 task2 = new TerminatingThreadTask2();
		TerminatingThreadTask2 task3 = new TerminatingThreadTask2();

		Thread thread1 = new Thread(task1, "MyThread-1");
		Thread thread2 = new Thread(task2, "MyThread-2");
		Thread thread3 = new Thread(task3, "MyThread-3");
		thread1.start();
		thread2.start();
		thread3.start();

		try {
			Thread.sleep(3000);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Interrupting Thread MyThread-1");
		thread1.interrupt();

		System.out.println("Interrupting Thread MyThread-2");
		thread2.interrupt();

		System.out.println("Interrupting Thread MyThread-3");
		thread3.interrupt();
	}
}