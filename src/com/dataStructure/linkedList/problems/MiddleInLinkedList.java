package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class MiddleInLinkedList {
	public Node middleNode(Node node) {
		Node temp1 = node;
		Node temp2 = node;
		while(temp2 != null && temp2.next != null) {
			temp2 = temp2.next.next;
			temp1 = temp1.next;
		}

		return temp1;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);

		Node head = linkedList.getHead();

		MiddleInLinkedList middle = new MiddleInLinkedList();
		Node node = middle.middleNode(head);
		System.out.println("Middle Node - "+node);
	}
}