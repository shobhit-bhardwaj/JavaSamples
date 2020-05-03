package com.dataStructure.linkedList.problems;

public class LengthOfLinkedList {
	private static int length(Node head) {
		int length = 0;

		Node node = head;
		while(node != null) {
			node = node.next;
			length++;
		}

		return length;
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

		int length = length(head);
		System.out.println("Length of List - " + length);
	}
}