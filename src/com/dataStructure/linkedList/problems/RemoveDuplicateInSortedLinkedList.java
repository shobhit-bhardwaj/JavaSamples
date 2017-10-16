package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class RemoveDuplicateInSortedLinkedList {
	public void removeDuplicate(Node node) {
		Node prev = node;
		while(node.next != null) {
			node = node.next;
			if(prev.data == node.data)
				prev.next = node.next;
			prev = node;
		}
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);
		linkedList.insertData(60);
		linkedList.insertData(60);
		linkedList.insertData(70);
		linkedList.insertData(70);
		Node head = linkedList.getHead();

		RemoveDuplicateInSortedLinkedList remove = new RemoveDuplicateInSortedLinkedList();
		remove.removeDuplicate(head);
		linkedList.traverse(head);
	}
}