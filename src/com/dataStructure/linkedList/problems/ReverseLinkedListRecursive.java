package com.dataStructure.linkedList.problems;

public class ReverseLinkedListRecursive {
	private static Node reverse(Node node) {
		if(node.next == null)
			return node;

		Node nextNode = node.next;
		node.next = null;
		Node temp = reverse(nextNode);
		nextNode.next = node;

		return temp;
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

		head = reverse(head);
		SinglyLinkedList.traverse(head);
	}
}