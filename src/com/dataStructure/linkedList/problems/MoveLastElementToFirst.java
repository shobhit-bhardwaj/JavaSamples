package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class MoveLastElementToFirst {
	public Node moveLastToFirst(Node node) {
		Node head = node;
		while(node.next.next != null)
			node = node.next;
		Node last = node.next;
		node.next = null;
		last.next = head;
		head = last;
		return head;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);

		Node head = linkedList.getHead();
		MoveLastElementToFirst move = new MoveLastElementToFirst();
		head = move.moveLastToFirst(head);
		linkedList.traverse(head);
	}
}