package com.dataStructure.linkedList.problems;

public class AlternateSplitLinkedList {
	private static void alternateSplit(Node head) {
		Node head1 = head;
		Node head2 = head.next;

		Node node1 = head1;
		Node node2 = head2;

		while(node1 != null && node1.next != null) {
			node1.next = node1.next.next;
			node1 = node1.next;

			if(node1 == null)
				break;

			node2.next = node2.next.next;
			node2 = node2.next;
		}

		SinglyLinkedList.traverse(head1);
		SinglyLinkedList.traverse(head2);
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(1)
				.insertData(2)
				.insertData(3)
				.insertData(4)
				.insertData(5)
				.insertData(6)
				.insertData(7)
				//.insertData(8)
				.getHead();
		SinglyLinkedList.traverse(head);

		alternateSplit(head);
	}
}