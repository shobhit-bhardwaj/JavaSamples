package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class NthNodeInLinkedList {
	public Node nthNode(Node node, int n) {
		Node temp;
		int counter = 1;
		for(temp=node; temp.next!=null; temp=temp.next) {
			if(counter == n)
				return temp;
			counter++;
		}

		return null;
	}

	public Node nthNodeFromLast(Node node, int n) {
		Node temp1;
		int counter = 1;
		for(temp1=node; temp1.next!=null; temp1=temp1.next) {
			if(counter == n)
				break;
			counter++;
		}

		Node temp2 = node;
		while(temp1.next!=null) {
			temp1 = temp1.next;
			temp2 = temp2.next;
		}

		return temp2;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);

		Node head = linkedList.getHead();

		NthNodeInLinkedList nthNode = new NthNodeInLinkedList();
		Node node = nthNode.nthNode(head, 3);
		System.out.println("Nth Node - "+node);
		node = nthNode.nthNodeFromLast(head, 4);
		System.out.println("Nth Node From Last - "+node);
	}
}