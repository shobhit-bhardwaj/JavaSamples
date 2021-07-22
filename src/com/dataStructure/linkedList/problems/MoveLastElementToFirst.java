package com.dataStructure.linkedList.problems;

public class MoveLastElementToFirst {
	private static Node moveLastToFirst(Node head) {
		Node node;
		for(node=head; node.next.next!= null; node=node.next);

		Node last = node.next;
		node.next = null;
		last.next = head;
		head = last;

		return head;
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.getHead();
		SinglyLinkedList.traverse(head);

		head = moveLastToFirst(head);
		SinglyLinkedList.traverse(head);
	}
}