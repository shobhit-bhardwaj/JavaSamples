package com.dataStructure.linkedList;

public class CirculerLinkedListDemo {
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;

	public void insertData(int data) {
		Node node = new Node(data);

		if(head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.next = head;
			tail = node;
		}
	}

	public void insertData(int data, int position) {
		if(position < 0)
			position = 0;

		int size = size();
		if(position > size)
			position = size;

		Node node = new Node(data);

		if(head == null) {
			head = node;
			tail = node;
		} else {
			if(position == 0) {
				node.next = head;
				tail.next = node;
				head = node;
			} else if(position == size) {
				tail.next = node;
				node.next = head;
				tail = node;
			} else {
				Node temp = head;
				for(int i=0; i<position-1; i++) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
			}
		}
	}

	public void deleteData(int position) {
		if(position < 0)
			position = 0;

		int size = size();
		if(position > size)
			position = size;

		if(position == 0) {
			head = head.next;
			tail.next = head;
		} else if(position == size) {
			Node temp = head;
			while(temp.next != tail) {
				temp = temp.next;
			}
			tail = temp;
			temp.next = temp.next.next;
		} else {
			Node temp = head;
			for(int i=0; i<position-1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}

	public void traverse() {
		Node temp = head;
		do {
			System.out.print(temp.data+"\t");
			temp = temp.next;
		} while (temp != head);

		System.out.println();
	}

	public int size() {
		int count = 0;

		Node temp = head;
		do {
			count++;
			temp = temp.next;
		} while(temp != head);

		return count;
	}

	public void test() {
		insertData(10);
		insertData(20);
		insertData(30);
		insertData(40);
		insertData(50);
		insertData(60, 0);
		insertData(70, 4);
		insertData(80, 9);
		traverse();
		System.out.println("Size - "+size());

		deleteData(4);
		deleteData(0);
		deleteData(9);
		traverse();
		System.out.println("Size - "+size());
	}

	public static void main(String[] args) {
		new CirculerLinkedListDemo().test();
	}
}