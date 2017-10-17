package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class IdenticalLinkedList {
	public boolean identical(Node head1, Node head2) {
		while(head1 != null && head2 != null) {
			if(head1.data != head2.data)
				return false;
			head1 = head1.next;
			head2 = head2.next;
		}

		if(head1 != null)
			return false;
		else if(head2 != null)
			return false;

		return true;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);
		Node head1 = linkedList.getHead();

		linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);
		Node head2 = linkedList.getHead();

		IdenticalLinkedList identicalList = new IdenticalLinkedList();
		boolean isIdentical = identicalList.identical(head1, head2);
		System.out.println("Is Identical List - "+isIdentical);
	}
}