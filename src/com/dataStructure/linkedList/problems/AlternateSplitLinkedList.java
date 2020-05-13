package com.dataStructure.linkedList.problems;

public class AlternateSplitLinkedList {
	private static void alternateSplit(Node head) {
		Node head1 = head;
		Node head2 = head.next;

		Node node1 = head1;
		Node node2 = head2;

		while(node1 != null && node1.next != null && node2 != null) {
			node1.next = node1.next.next;
			node1 = node1.next;

			if(node2.next != null) {
				node2.next = node2.next.next;
				node2 = node2.next;
			}
		}

		SinglyLinkedList.traverse(head1);
		SinglyLinkedList.traverse(head2);
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(1)
				.insertData(2)
				.insertData(3)
				.insertData(4)
				.insertData(5)
				.insertData(6)
				.insertData(7)
				//.insertData()
				.getHead();
		System.out.println(linkedList);

		alternateSplit(head);
	}
}