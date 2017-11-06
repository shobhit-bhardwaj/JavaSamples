package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class RearrangeLinkedListInPlace {
	public Node rearrange(Node head) {
		Node node = head;
		while(node.next != null) {
			Node second = node;
			while(second.next.next != null) {
				second = second.next;
			}
			Node temp = node.next;
			second.next.next = node.next;
			node.next = second.next;
			second.next = null;
			node = temp;
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
		Node head = linkedList.getHead();
		linkedList.traverse(head);

		RearrangeLinkedListInPlace rearrangeLinkedList = new RearrangeLinkedListInPlace();
		head = rearrangeLinkedList.rearrange(head);
		linkedList.traverse(head);
	}
}