package com.concurrent;

import java.util.concurrent.Exchanger;

class ExchangerRunnable extends Thread {
	private Exchanger<String> exchanger;
	private String value;

	public ExchangerRunnable(Exchanger<String> exchanger, String value) {
		this.exchanger = exchanger;
		this.value = value;
	}

	@Override
	public void run() {
		try {
			String prevValue = value;
			String nextValue = exchanger.exchange(prevValue);
			System.out.println(Thread.currentThread().getName()+" Exchanged "+prevValue +" - "+nextValue);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

public class ExchangerTest {
	public static void main(String[] args) {
		Exchanger<String> exchanger = new Exchanger<>();
		ExchangerRunnable runnable1 = new ExchangerRunnable(exchanger, "A");
		ExchangerRunnable runnable2 = new ExchangerRunnable(exchanger, "B");
		//ExchangerRunnable runnable3 = new ExchangerRunnable(exchanger, "C");
		runnable1.start();
		runnable2.start();
		//runnable3.start();
	}
}