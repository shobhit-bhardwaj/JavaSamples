package com.collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class ArrayDequeDemo {
	static class Employ {
		private int id;
		private String name;

		public Employ(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return id+" - "+name;
		}
	}

	public static void main(String[] args) {
		ArrayDeque<Employ> deque = new ArrayDeque<>();
		deque.add(new Employ(3, "CCC"));
		deque.addLast(new Employ(1, "AAA"));
		deque.addFirst(new Employ(2, "BBB"));

		System.out.println("Peek - "+deque.peek());
		System.out.println("Element - "+deque.element());
		System.out.println();

		int size = deque.size();
		for(int i=0; i<size; i++) {
			System.out.println("Poll - "+deque.poll());
			//System.out.println("Poll - "+deque.pollFirst());
			//System.out.println("Poll - "+deque.pollLast());
		}
	}
}