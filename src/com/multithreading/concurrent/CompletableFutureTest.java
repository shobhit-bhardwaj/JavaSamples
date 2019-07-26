package com.multithreading.concurrent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureTest {
	public String getA() {
		try {
			System.out.println("Inside Method getA");
			TimeUnit.SECONDS.sleep(5);
			System.out.println("Exiting Method getA");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "A";
	}

	public String getB() {
		try {
			System.out.println("Inside Method getB");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("Exiting Method getB");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "B";
	}

	public String getC() {
		try {
			System.out.println("Inside Method getC");
			TimeUnit.SECONDS.sleep(7);
			System.out.println("Exiting Method getC");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "C";
	}

	public void test() {
		try {
			CompletableFuture<String> a = CompletableFuture.supplyAsync(() -> getA());
			CompletableFuture<String> b = CompletableFuture.supplyAsync(() -> getB());
			CompletableFuture<Void> c = CompletableFuture.runAsync(() -> getC());

			CompletableFuture.allOf(a, b, c).join();

			System.out.println("Return From Method getA - " + a.get());
			System.out.println("Return From Method getB - " + b.get());
			System.out.println("Return From Method getC - " + c.get());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new CompletableFutureTest().test();
	}
}