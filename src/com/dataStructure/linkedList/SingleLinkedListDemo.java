package com.dataStructure.linkedList;

public class SingleLinkedListDemo {
	private class Node {
		private int data;
		private Node next;

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
				head = node;
			} else if(position == size) {
				tail.next = node;
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

		size++;
	}

	public void deleteData(int position) {
		if(position < 0)
			position = 0;
		if(position > size)
			position = size;

		if(position == 0) {
			head = head.next;
		} else if(position == size) {
			Node temp = head;
			while(temp.next != tail) {
				temp = temp.next;
			}
			temp.next = null;
			tail = temp;
		} else {
			Node temp = head;
			for(int i=0; i<position-1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}

		size--;
	}

	public void traverse() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"\t");
			temp = temp.next;
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
		traverse();
		System.out.println("Size - "+size);

		deleteData(4);
		deleteData(0);
		deleteData(9);
		traverse();
		System.out.println("Size - "+size);
	}

	public static void main(String[] args) {
		new SingleLinkedListDemo().test();
	}
}