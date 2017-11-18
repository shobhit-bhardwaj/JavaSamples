package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class MakeMiddleNodeHeadLinkedList {
	public Node makeMiddleNodeHead(Node head) {
		Node prev = null;
		Node node = head;
		Node secondNode = head;
		while(secondNode != null && secondNode.next != null) {
			secondNode = secondNode.next.next;
			prev = node;
			node = node.next;
		}

		prev.next = node.next;
		node.next = head;
		head = node;

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
		linkedList.traverse(head);

		MakeMiddleNodeHeadLinkedList list = new MakeMiddleNodeHeadLinkedList();
		head = list.makeMiddleNodeHead(head);
		linkedList.traverse(head);
	}
}