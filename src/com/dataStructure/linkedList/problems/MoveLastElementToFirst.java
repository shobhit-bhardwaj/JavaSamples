package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class MoveLastElementToFirst {
	public void moveLastToFirst(Node node) {
		Node head = node;
		while(node != null)
			node = node.next;
		Node temp1 = head;
		Node temp2 = node;
		head = node;
		head.next = temp1.next;
		
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
		move.moveLastToFirst(head);
		linkedList.traverse(head);
	}
}