package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class LoopInLinkedList {
	public boolean floydCycleAlgorithm(Node node) {
		Node temp1 = node;
		Node temp2 = node;
		while(temp2 != null && temp2.next != null) {
			temp2 = temp2.next.next;
			temp1 = temp1.next;

			if(temp1 == temp2)
				return true;
		}

		return false;
	}

	public void test() {
		LinkedListDemo linkedList = new LinkedListDemo();
		Node head = linkedList.createNode(10);
		Node node1 = linkedList.createNode(20);
		Node node2 = linkedList.createNode(30);
		Node node3 = linkedList.createNode(40);
		Node node4 = linkedList.createNode(50);
		head.next = node1;
		head.next.next = node2;
		head.next.next.next = node3;
		head.next.next.next.next = node4;
		head.next.next.next.next.next = node1;

		LoopInLinkedList loopDetection = new LoopInLinkedList();
		boolean loopFound = loopDetection.floydCycleAlgorithm(head);
		System.out.println("Loop Found - "+loopFound);
	}

	public static void main(String[] args) {
		new LoopInLinkedList().test();
	}
}