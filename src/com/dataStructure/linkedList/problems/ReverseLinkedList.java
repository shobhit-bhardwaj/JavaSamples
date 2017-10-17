package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class ReverseLinkedList {
	public Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;

		return head;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);
		Node head = linkedList.getHead();
		linkedList.traverse(head);

		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
		head = reverseLinkedList.reverse(head);
		linkedList.traverse(head);
	}
}