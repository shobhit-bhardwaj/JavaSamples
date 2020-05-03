package com.dataStructure.linkedList.problems;

public class CountRotationInSortedLinkedList {
	private static Node countRotation(Node head) {
		Node node = head;

		int k = 1;
		Node newHead = null;
		while(node.next != null) {
			k++;
			if(node.data > node.next.data)
				newHead = node;

			node = node.next;
		}

		System.out.println("Rotation No - " + k);

		node.next = head;
		head = newHead.next;
		newHead.next = null;

		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList
				.insertData(13)
				.insertData(18)
				.insertData(5)
				.insertData(9)
				.insertData(11)
				.getHead();
		System.out.println(linkedList);

		head = countRotation(head);
		SinglyLinkedList.traverse(head);
	}
}