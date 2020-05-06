package com.dataStructure.linkedList.problems;

public class RotateLinkedList {
	private static Node rotate(Node head, int k) {
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
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.getHead();
		System.out.println(linkedList);

		head = rotate(head, 3);
		SinglyLinkedList.traverse(head);
	}
}