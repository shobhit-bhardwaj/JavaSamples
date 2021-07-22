package com.dataStructure.linkedList.problems;

public class MakeMiddleNodeHeadLinkedList {
	private static Node makeMiddleNodeHead(Node head) {
		Node fast = head;
		Node prev = null;
		Node slow = head;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}

		prev.next = prev.next.next;
		slow.next = head;
		head = slow;

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

		head = makeMiddleNodeHead(head);
		SinglyLinkedList.traverse(head);
	}
}