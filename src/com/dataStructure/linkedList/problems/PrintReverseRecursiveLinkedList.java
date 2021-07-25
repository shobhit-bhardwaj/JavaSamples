package com.dataStructure.linkedList.problems;

public class PrintReverseRecursiveLinkedList {
	private static void printReverseRecursive(Node node) {
		if(node == null)
			return;

		printReverseRecursive(node.next);
		System.out.print(node.data + "  -->  ");
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

		printReverseRecursive(head);
	}
}