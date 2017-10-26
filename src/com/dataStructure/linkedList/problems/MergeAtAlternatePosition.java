package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class MergeAtAlternatePosition {
	public Node mergeAtAlternate(Node head1, Node head2) {
		Node head = head1;

		Node pCurr = head1;
		Node qCurr = head2;
		while(pCurr != null && qCurr != null) {
			Node pNext = pCurr.next;
			Node qNext = qCurr.next;
			qCurr.next = pNext;
			pCurr.next = qCurr;
			pCurr = pNext;
			qCurr = qNext;
		}

		return head;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);
		Node head1 = linkedList.getHead();
		linkedList.traverse(head1);

		linkedList = new LinkedListDemo();
		linkedList.insertData(60);
		linkedList.insertData(70);
		linkedList.insertData(80);
		linkedList.insertData(90);
		Node head2 = linkedList.getHead();
		linkedList.traverse(head2);

		MergeAtAlternatePosition merge = new MergeAtAlternatePosition();
		Node head = merge.mergeAtAlternate(head1, head2);
		linkedList.traverse(head);
	}
}