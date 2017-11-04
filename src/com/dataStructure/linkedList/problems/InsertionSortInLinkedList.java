package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class InsertionSortInLinkedList {
	private static Node mainHead = null;
	private static Node sortHead = null;

	public Node insertionSort(Node head) {
		Node current = head;

		while(current != null) {
			Node next = current.next;
			sortNode(current);
			current = next;
		}

		return sortHead;
	}

	public void sortNode(Node newNode) {
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
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(20);
		linkedList.insertData(10);
		linkedList.insertData(40);
		linkedList.insertData(30);
		linkedList.insertData(50);
		mainHead = linkedList.getHead();
		linkedList.traverse(mainHead);

		InsertionSortInLinkedList insertionSort = new InsertionSortInLinkedList();
		sortHead = insertionSort.insertionSort(mainHead);
		linkedList.traverse(sortHead);
	}
}