package com.dataStructure.linkedList.problems;

public class MoveLastElementToFirst {
	private static Node moveLastToFirst(Node node) {
		Node head = node;
		while(node.next.next != null)
			node = node.next;
		Node last = node.next;
		node.next = null;
		last.next = head;
		head = last;
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