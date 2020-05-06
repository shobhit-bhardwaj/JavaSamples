package com.dataStructure.linkedList.problems;

public class ReverseLinkedList {
	private static Node reverse(Node head) {
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
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.getHead();
		System.out.println(linkedList);

		head = reverse(head);
		SinglyLinkedList.traverse(head);
	}
}