package com.dataStructure;

public class SingleLinkedListDemo {
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;

	public void insertData(int data) {
		Node node = new Node(data);

		if(head == null)
			head = node;
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void insertData(int data, int position) {
		if(position < 0)
			position = 0;

		int size = size();
		if(position > size)
			position = size;

		Node node = new Node(data);

		if(head == null)
			head = node;
		else {
			if(position == 0) {
				node.next = head;
				head = node;
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
		if(position >= size)
			position = size-1;

		if(position == 0) {
			head = head.next;
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
		while(temp != null) {
			System.out.print(temp.data+"\t");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int count = 0;

		Node temp = head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}

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
		new SingleLinkedListDemo().test();
	}
}