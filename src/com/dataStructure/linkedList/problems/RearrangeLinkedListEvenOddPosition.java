package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class RearrangeLinkedListEvenOddPosition {
	public Node rearrange(Node head) {
		Node odd = head;
		Node even = head.next;
		Node evenFirst = even;
		while(odd.next != null && odd.next.next != null) {
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}
		odd.next = evenFirst;

		return head;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);
		//linkedList.insertData(60);
		Node head = linkedList.getHead();
		linkedList.traverse(head);

		RearrangeLinkedListEvenOddPosition rearrangeLinkedList = new RearrangeLinkedListEvenOddPosition();
		head = rearrangeLinkedList.rearrange(head);
		linkedList.traverse(head);
	}
}