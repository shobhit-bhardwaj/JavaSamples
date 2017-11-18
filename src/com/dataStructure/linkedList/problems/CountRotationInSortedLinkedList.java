package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class CountRotationInSortedLinkedList {
	public Node countRotation(Node head) {
		Node node = head;

		int k = 1;
		Node newHead = null;
		while(node.next != null) {
			k++;
			if(node.data > node.next.data)
				newHead = node;

			node = node.next;
		}

		System.out.println("Rotation No - "+k);

		node.next = head;
		head = newHead.next;
		newHead.next = null;

		return head;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(13);
		linkedList.insertData(18);
		linkedList.insertData(5);
		linkedList.insertData(9);
		linkedList.insertData(11);
		Node head = linkedList.getHead();
		linkedList.traverse(head);

		CountRotationInSortedLinkedList list = new CountRotationInSortedLinkedList();
		head = list.countRotation(head);
		linkedList.traverse(head);
	}
}