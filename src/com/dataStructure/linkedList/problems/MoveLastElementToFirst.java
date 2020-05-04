package com.dataStructure.linkedList.problems;

public class MoveLastElementToFirst {
	private static Node moveLastToFirst(Node head) {
		Node node = head;
		Node prev = null;
		while(node.next != null) {
			prev = node;
			node = node.next;
		}

		node.next = head;
		prev.next = null;
		head = node;

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

		head = moveLastToFirst(head);
		SinglyLinkedList.traverse(head);
	}
}