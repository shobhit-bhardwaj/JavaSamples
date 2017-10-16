package com.dataStructure.linkedList.problems;

public class LinkedListDemo {
	public class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}

	private Node head;

	public Node getHead() {
		return head;
	}

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
		System.out.println();
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