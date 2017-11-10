package com.designProblems.lru;

class LRUList {
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}

	private Node head;
	private int capecity;
	private int size;

	public LRUList(int capecity) {
		this.capecity = capecity;
	}

	public void set(int data) {
		Node node = new Node(data);

		if(head == null) {
			head = node;
			size++;
		} else {
			if(size < capecity) {
				Node temp = head;
				while(temp.next != null)
					temp = temp.next;
				temp.next = node;
				size++;
			} else {
				head = head.next;
				Node temp = head;
				while(temp.next != null)
					temp = temp.next;
				temp.next = node;
			}
		}
	}

	public void traverse() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"\t");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class LRUCacheWithLinkedListTest {
	public static void main(String[] args) {
		LRUList lru = new LRUList(3);
		lru.set(10);
		lru.set(20);
		lru.set(30);
		lru.traverse();
		lru.set(40);
		lru.set(50);
		lru.traverse();
	}
}