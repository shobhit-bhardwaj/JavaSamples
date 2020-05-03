package com.dataStructure.linkedList.problems;

public class InsertAfterNNodeFromEndLinkedList {
	private static Node insertAfterNNodeFromEnd(Node head, Node newNode, int n) {
		int i = 0;
		Node fastNode = head;
		while(i != n) {
			fastNode = fastNode.next;
			i++;
		}

		Node node = head;
		while(fastNode != null) {
			node = node.next;
			fastNode = fastNode.next;
		}

		newNode.next = node.next;
		node.next = newNode;

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

		head = insertAfterNNodeFromEnd(head, Node.createNode(25), 3);
		SinglyLinkedList.traverse(head);
	}
}