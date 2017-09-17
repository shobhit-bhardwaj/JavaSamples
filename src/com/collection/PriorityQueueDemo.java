package com.collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	static class Employ implements Comparable<Employ> {
		private int id;
		private String name;

		public Employ(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public int compareTo(Employ employ) {
			return this.id - employ.id;
		}

		@Override
		public String toString() {
			return id+" - "+name;
		}
	}

	public static void main(String[] args) {
		PriorityQueue<Employ> queue = new PriorityQueue<>();
		queue.add(new Employ(3, "CCC"));
		queue.add(new Employ(1, "AAA"));
		queue.add(new Employ(2, "BBB"));

		System.out.println("Peek - "+queue.peek());
		System.out.println("Element - "+queue.element());
		System.out.println();

		int size = queue.size();
		for(int i=0; i<size; i++) {
			System.out.println("Poll - "+queue.poll());
		}
	}
}