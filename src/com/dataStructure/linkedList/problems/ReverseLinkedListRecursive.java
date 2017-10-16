package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class ReverseLinkedListRecursive {
	public void printReverseRecursive(Node node) {
		if(node == null)
			return;
		else {
			printReverseRecursive(node.next);
			System.out.print(node.data+"\t");
		}
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);

		Node head = linkedList.getHead();
		ReverseLinkedListRecursive reverse = new ReverseLinkedListRecursive();
		reverse.printReverseRecursive(head);
	}
}