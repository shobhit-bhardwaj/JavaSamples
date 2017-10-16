package com.dataStructure.linkedList.problems;

public class LinkedListDemo {
	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public Node getNext() {
			return next;
		}

	}

	private Node head;

	public void insertData(int data) {
		Node node = new Node(data);

		if(head == null)
			head = node;
		else {
			Node temp;
			for(temp=head; temp.next!=null; temp=temp.next);
			temp.next = node;
		}
	}

	public void traverse() {
		for(Node temp=head; temp!=null; temp=temp.next)
			System.out.print(temp.data+"\t");
	}

	public void test() {
		insertData(10);
		insertData(20);
		insertData(30);
		insertData(40);
		insertData(50);
		traverse();
	}

	public static void main(String[] args) {
		new LinkedListDemo().test();
	}
}