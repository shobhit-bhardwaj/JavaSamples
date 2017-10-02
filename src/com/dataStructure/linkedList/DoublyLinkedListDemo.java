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

	public void insertData(int data) {
		Node node = new Node(data);

		if(head == null) {
			head = node;
			tail = head;
		} else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			tail = node;
			temp.next = node;
			node.prev = temp;
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
			tail = head;
		} else {
			if(position == 0) {
				node.next = head;
				head.prev = node;
				head = node;
			} else {
				Node temp = head;
				for(int i=0; i<position-1; i++) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
				node.prev = temp;
				if(position == size)
					tail = node;
				else
					node.next.prev = node;
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
			head.prev = null;
		} else {
			Node temp = head;
			for(int i=0; i<position-1; i++) {
				temp = temp.next;
			}
			temp.next = temp.next.next;
			if(position == size-1)
				tail = temp;
			else
				temp.next.prev = temp;
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
		traverse(true);
		traverse(false);
		System.out.println("Size - "+size());

		deleteData(4);
		deleteData(0);
		deleteData(9);
		traverse(true);
		traverse(false);
		System.out.println("Size - "+size());
	}

	public static void main(String[] args) {
		new DoublyLinkedListDemo().test();
	}
}