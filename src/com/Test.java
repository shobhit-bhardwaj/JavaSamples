package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

class ReaderThread extends Thread {
	private List<Integer> intList;

	public ReaderThread(List<Integer> intList) {
		this.intList = intList;
	}

	@Override
	public void run() {
		synchronized (intList) {
			Iterator<Integer> iterator = intList.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
				try {
					TimeUnit.MILLISECONDS.sleep(200);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		}
		
	}
}

class WriterThread extends Thread {
	private List<Integer> intList;
	private int value;

	public WriterThread(List<Integer> intList, int value) {
		this.intList = intList;
		this.value = value;
	}

	@Override
	public void run() {
		intList.remove(value);
	}
}

public class Test {
	public static void main(String[] args) {
		//List<Integer> intList = new CopyOnWriteArrayList<>();
		List<Integer> intList = new ArrayList<>();
		for(int i=0; i<10; i++) {
			intList.add(i);
		}
		intList = Collections.synchronizedList(intList);
		for(int i=0; i<4; i++) {
			new WriterThread(intList, i).start();
			new ReaderThread(intList).start();
		}
	}
}