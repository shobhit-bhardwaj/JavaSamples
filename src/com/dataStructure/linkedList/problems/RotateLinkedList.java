package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class RotateLinkedList {
	public Node rotate(Node head, int k) {
		Node newHead = null;

		int counter = 1;
		Node current = head;
		Node prev = null;
		while(current != null) {
			if(counter == k) {
				newHead = current;
				prev.next = null;
			}
			counter++;
			prev = current;
			current = current.next;
		}
		prev.next = head;
		head = newHead;

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

		RotateLinkedList rotateLinkedList = new RotateLinkedList();
		head = rotateLinkedList.rotate(head, 3);
		linkedList.traverse(head);
	}
}