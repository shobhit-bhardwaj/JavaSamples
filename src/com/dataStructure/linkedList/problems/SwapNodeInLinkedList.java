package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class SwapNodeInLinkedList {
	public void swapNodes(Node node, int data1, int data2) {
		if(data1 == data2)
			return;
		else {
			Node currX = node;
			Node prevX = null;
			while(currX != null && currX.data != data1) {
				prevX = currX;
				currX = currX.next;
			}

			Node currY = node;
			Node prevY = null;
			while(currY != null && currY.data != data2) {
				prevY = currY;
				currY = currY.next;
			}

			if(prevX != null)
				prevX.next = currY;
			if(prevY != null)
				prevY.next = currX;

			Node temp = currX.next;
			currX.next = currY.next;
			currY.next = temp;
		}
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);
		linkedList.traverse();

		Node head = linkedList.getHead();

		SwapNodeInLinkedList swap = new SwapNodeInLinkedList();
		swap.swapNodes(head, 20, 40);
		linkedList.traverse();
	}
}