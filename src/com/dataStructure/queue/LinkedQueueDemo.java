package com.dataStructure.queue;

public class LinkedQueueDemo {
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node front;
	private Node rear;

	public boolean enqueue(int data) {
		Node node = new Node(data);

		if(front == null) {
			front = node;
			rear = node;
		} else {
			front.next = node;
			front = node;
		}

		return true;
	}

	public int dequeue() {
		if(rear == null) {
			front = null;
			return -1;
		} else {
			int data = rear.data;
			rear = rear.next;
			return data;
		}
	}

	public void traverse() {
		Node node = rear;
		while(node != null) {
			System.out.print(node.data+"\t");
			node = node.next;
		}
		System.out.println();
	}

	public void test() {
		System.out.println("Enqueue 1 - "+enqueue(1));
		System.out.println("Enqueue 2 - "+enqueue(2));
		System.out.println("Enqueue 3 - "+enqueue(3));
		traverse();
		System.out.println("Dequeue - "+dequeue());
		System.out.println("Dequeue - "+dequeue());
		System.out.println("Dequeue - "+dequeue());
		System.out.println("Dequeue - "+dequeue());
		System.out.println("Dequeue - "+dequeue());
	}

	public static void main(String[] args) {
		new LinkedQueueDemo().test();
		
	}
}