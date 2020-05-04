package com.dataStructure.linkedList.problems;

public class MakeMiddleNodeHeadLinkedList {
	private static Node makeMiddleNodeHead(Node head) {
		Node prev = null;
		Node node = head;
		Node secondNode = head;
		while(secondNode != null && secondNode.next != null) {
			secondNode = secondNode.next.next;
			prev = node;
			node = node.next;
		}

		prev.next = node.next;
		node.next = head;
		head = node;

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

		head = makeMiddleNodeHead(head);
		SinglyLinkedList.traverse(head);
	}
}