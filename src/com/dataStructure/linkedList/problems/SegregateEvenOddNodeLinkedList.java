package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class SegregateEvenOddNodeLinkedList {
	public Node segregateEvenOdd(Node head) {
		Node odd = null;
		Node current = head;
		Node prev = null;
		while(current != null) {
			if(current.data%2 == 1) {
				if(odd == null) {
					odd = new LinkedListDemo().createNode(current.data);
				} else {
					Node temp = odd;
					while(temp.next != null)
						temp = temp.next;
					temp.next = new LinkedListDemo().createNode(current.data);
				}
				if(prev == null)
					head = head.next;
				else {
					prev.next = prev.next.next;
				}
			}
			prev = current;
			current = current.next;
		}
		prev.next = odd;

		return head;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(4);
		linkedList.insertData(1);
		linkedList.insertData(2);
		linkedList.insertData(7);
		linkedList.insertData(8);
		linkedList.insertData(12);
		linkedList.insertData(11);
		linkedList.insertData(14);
		Node head = linkedList.getHead();

		SegregateEvenOddNodeLinkedList segregate = new SegregateEvenOddNodeLinkedList();
		head = segregate.segregateEvenOdd(head);
		linkedList.traverse(head);
	}
}