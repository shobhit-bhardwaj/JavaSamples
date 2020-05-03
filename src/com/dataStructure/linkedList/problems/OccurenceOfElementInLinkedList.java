package com.dataStructure.linkedList.problems;

public class OccurenceOfElementInLinkedList {
	private static int occurenceOfElement(Node head, int key) {
		Node node = head;

		int occurence = 0;
		while(node != null) {
			if(node.data == key)
				occurence++;

			node = node.next;
		}

		return occurence;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(10)
				.insertData(20)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(20)
				.insertData(50)
				.insertData(20)
				.insertData(60)
				.insertData(20)
				.getHead();
		System.out.println(linkedList);

		int occurence = occurenceOfElement(head, 20);
		System.out.println("Occurence - " + occurence);
	}
}