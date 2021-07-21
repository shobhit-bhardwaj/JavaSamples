package com.dataStructure.linkedList.problems;

public class MiddleInLinkedList {
	private static Node middleNode(Node node) {
		Node slow = node;
		Node fast = node;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.insertData(60)
				.getHead();
		SinglyLinkedList.traverse(head);

		Node node = middleNode(head);
		System.out.println("Middle Node - " + node.getData());
	}
}