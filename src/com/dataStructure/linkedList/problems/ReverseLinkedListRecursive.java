package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class ReverseLinkedListRecursive {
	public Node reverse(Node node) {
		if(node.next == null)
			return node;

		Node nextNode = node.next;
		node.next = null;
		Node temp = reverse(nextNode);
		nextNode.next = node;
		return temp;
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

		ReverseLinkedListRecursive reverseLinkedListRecursive = new ReverseLinkedListRecursive();
		head = reverseLinkedListRecursive.reverse(head);
		linkedList.traverse(head);
	}
}