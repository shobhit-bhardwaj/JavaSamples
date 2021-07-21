package com.dataStructure.linkedList.problems;

public class InsertionSortInLinkedList {
	private static Node mainHead = null;
	private static Node sortHead = null;

	private static Node insertionSort(Node head) {
		Node current = head;

		while(current != null) {
			Node next = current.next;
			sortNode(current);
			current = next;
		}

		return sortHead;
	}

	private static void sortNode(Node newNode) {
		newNode.next = null;

		if(sortHead == null) {
			sortHead = newNode;
		} else {
			if(sortHead.data > newNode.data) {
				newNode.next = sortHead;
				sortHead = newNode;
			} else {
				Node current = sortHead;
				Node prev = null;
				while(current != null) {
					if(current.data > newNode.data) {
						prev.next = newNode;
						newNode.next = current;
						break;
					} else {
						prev = current;
						current = current.next;
						if(current == null) {
							prev.next = newNode;
							break;
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		mainHead = new SinglyLinkedList()
				.insertData(20)
				.insertData(10)
				.insertData(40)
				.insertData(30)
				.insertData(50)
				.getHead();
		SinglyLinkedList.traverse(mainHead);

		sortHead = insertionSort(mainHead);
		SinglyLinkedList.traverse(sortHead);
	}
}