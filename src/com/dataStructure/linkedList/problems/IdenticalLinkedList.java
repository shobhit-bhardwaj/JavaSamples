package com.dataStructure.linkedList.problems;

public class IdenticalLinkedList {
	private static boolean identical(Node head1, Node head2) {
		while(head1 != null && head2 != null) {
			if(head1.data != head2.data)
				return false;
			head1 = head1.next;
			head2 = head2.next;
		}

		if(head1 != null)
			return false;
		else if(head2 != null)
			return false;

		return true;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head1 = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.getHead();
		System.out.println(linkedList);

		linkedList = new SinglyLinkedList();
		Node head2 = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.getHead();
		System.out.println(linkedList);

		boolean isIdentical = identical(head1, head2);
		System.out.println("Is Identical List - " + isIdentical);
	}
}