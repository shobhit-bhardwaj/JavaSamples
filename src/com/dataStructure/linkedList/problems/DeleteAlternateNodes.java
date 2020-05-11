package com.dataStructure.linkedList.problems;

public class DeleteAlternateNodes {
	private static Node deleteAlternateNodes(Node head) {
		Node node = head;
		while(node != null && node.next != null) {
			node.next = node.next.next;
			node = node.next;
		}

		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.insertData(60)
				.insertData(70)
				.insertData(80)
				.insertData(90)
				.getHead();
		System.out.println(linkedList);

		head = deleteAlternateNodes(head);
		SinglyLinkedList.traverse(head);
	}
}