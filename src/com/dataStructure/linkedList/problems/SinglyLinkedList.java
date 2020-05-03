package com.dataStructure.linkedList.problems;

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public static Node createNode(int data) {
		return new Node(data);
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}

public class SinglyLinkedList {
	private Node head;

	public Node getHead() {
		return head;
	}

	public SinglyLinkedList insertData(int data) {
		Node node = new Node(data);

		if (head == null)
			head = node;
		else {
			Node temp;
			for (temp=head; temp.next!=null; temp=temp.next);
			temp.next = node;
		}

		return this;
	}

	public void traverse() {
		traverse(head);
	}

	public static void traverse(Node node) {
		System.out.println(traverseData(node));
	}

	private static String traverseData(Node node) {
		String value = "";

		for (Node temp=node; temp!=null; temp=temp.next)
			value += temp.data + "  -->  ";
		value += "null\n";

		return value;
	}

	@Override
	public String toString() {
		return traverseData(head);
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		linkedList.insertData(10).insertData(20).insertData(30).insertData(40).insertData(50);

		linkedList.traverse();
		System.out.println(linkedList);
	}
}