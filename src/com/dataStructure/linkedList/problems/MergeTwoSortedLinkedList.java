package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class MergeTwoSortedLinkedList {
	public Node mergeList(Node node1, Node node2) {
		Node head = new LinkedListDemo().createNode(0);
		Node result = head;

		while(node1 != null && node2 != null) {
			if(node1.data < node2.data) {
				result.next = node1;
				node1 = node1.next;
			} else {
				result.next = node2;
				node2 = node2.next;
			}
			result = result.next;
		}

		if(node1 != null)
			result.next = node1;
		if(node2 != null)
			result.next = node2;

		return head.next;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(70);
		linkedList.insertData(80);
		Node head1 = linkedList.getHead();

		linkedList = new LinkedListDemo();
		linkedList.insertData(20);
		linkedList.insertData(50);
		linkedList.insertData(60);
		linkedList.insertData(100);
		Node head2 = linkedList.getHead();

		MergeTwoSortedLinkedList merge = new MergeTwoSortedLinkedList();
		Node head = merge.mergeList(head1, head2);
		linkedList.traverse(head);
	}
}