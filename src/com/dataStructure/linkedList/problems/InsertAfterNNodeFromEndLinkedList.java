package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class InsertAfterNNodeFromEndLinkedList {
	public Node insertAfterNNodeFromEnd(Node head, Node newNode, int n) {
		int i = 0;
		Node fastNode = head;
		while(i != n) {
			fastNode = fastNode.next;
			i++;
		}

		Node node = head;
		while(fastNode != null) {
			node = node.next;
			fastNode = fastNode.next;
		}

		newNode.next = node.next;
		node.next = newNode;

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

		InsertAfterNNodeFromEndLinkedList list = new InsertAfterNNodeFromEndLinkedList();
		head = list.insertAfterNNodeFromEnd(head, linkedList.createNode(25), 3);
		linkedList.traverse(head);
	}
}