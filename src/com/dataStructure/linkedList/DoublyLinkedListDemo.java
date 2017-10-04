package com.dataStructure.linkedList;

public class DoublyLinkedListDemo {
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
			tail = head;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}

		size++;
	}

	public void insertData(int data, int position) {
		if(position < 0)
			position = 0;
		else if(position > size)
			position = size;

		Node node = new Node(data);

		if(head == null) {
			head = node;
			tail = head;
		} else {
			if(position == 0) {
				node.next = head;
				head.prev = node;
				head = node;
			} else if(position == size) {
				tail.next = node;
				node.prev = tail;
				tail = node;
			} else {
				Node temp = head;
				for(int i=0; i<position-1; i++) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
				node.prev = temp;
				node.next.prev = node;
			}
		}

		size++;
	}

	public void deleteData(int position) {
		if(position < 0)
			position = 0;
		else if(position > size)
			position = size;

		if(position == 0) {
			head = head.next;
			head.prev = null;
		} else if(position == size) {
			tail = tail.prev;
			tail.next = null;
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

	public void updateData(int position, int data) {
		if(position < 0)
			position = 0;
		else if(position > size)
			position = size;

		if(position == 0)
			head.data = data;
		else if(position == size)
			tail.data = data;
		else {
			Node temp = head;
			for(int i=0; i<position; i++) {
				temp = temp.next;
			}
			temp.data = data;
		}
	}

	public void traverse(boolean forward) {
		if(forward) {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data+"\t");
				temp = temp.next;
			}
		} else {
			Node temp = tail;
			while(temp != null) {
				System.out.print(temp.data+"\t");
				temp = temp.prev;
			}
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

		updateData(2, 15);
		updateData(0, 25);
		updateData(9, 35);
		traverse(true);
		traverse(false);
		System.out.println("Size - "+size);
	}

	public static void main(String[] args) {
		new DoublyLinkedListDemo().test();
	}
}