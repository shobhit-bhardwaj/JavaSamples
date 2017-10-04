package com.dataStructure.linkedList;

public class CirculerDoublyLinkedListDemo {
	private class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public void insertData(int data) {
		Node node = new Node(data);

		if(head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			node.prev = tail;
			head.prev = node;
			tail.next = node;
			tail = node;
		}

		size++;
	}

	public void insertData(int data, int position) {
		if(position < 0)
			position = 0;
		if(position > size)
			position = size;

		Node node = new Node(data);

		if(head == null) {
			head = node;
			tail = node;
		} else {
			if(position == 0) {
				node.next = head;
				node.prev = tail;
				head.prev = node;
				tail.next = node;
				head = node;
			} else if(position == size) {
				tail.next = node;
				node.prev = tail;
				node.next = head;
				head.prev = node;
				tail = node;
			} else {
				Node temp = head;
				for(int i=0; i<position-1; i++) {
					temp = temp.next;
				}
				node.prev = temp;
				node.next = temp.next;
				temp.next.prev = node;
				temp.next = node;
			}
		}

		size++;
	}

	public void deleteData(int position) {
		if(position < 0)
			position = 0;
		if(position > size)
			position = size;

		if(position == 0) {
			tail.next = tail.next.next;
			tail.next.prev = tail;
			head = tail.next;
		} else if(position == size) {
			head.prev = head.prev.prev;
			head.prev.next = head;
			tail = head.prev;
		} else {
			Node temp = head;
			for(int i=0; i<position-1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}

		size--;
	}

	public void traverse(boolean forward) {
		if(forward) {
			Node temp = head;
			do {
				System.out.print(temp.data+"\t");
				temp = temp.next;
			} while (temp != head);
		} else {
			Node temp = tail;
			do {
				System.out.print(temp.data+"\t");
				temp = temp.prev;
			} while (temp != tail);
		}

		System.out.println();
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
		traverse(true);
		traverse(false);
		System.out.println("Size - "+size);

		deleteData(4);
		deleteData(0);
		deleteData(9);
		traverse(true);
		traverse(false);
		System.out.println("Size - "+size);
	}

	public static void main(String[] args) {
		new CirculerDoublyLinkedListDemo().test();
	}
}