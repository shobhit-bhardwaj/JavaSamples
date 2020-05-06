package com.dataStructure.linkedList.problems;

public class SegregateEvenOddNodeLinkedList {
	private static Node segregateEvenOdd(Node head) {
		Node odd = null;
		Node current = head;
		Node prev = null;
		while(current != null) {
			if(current.data%2 == 1) {
				if(odd == null) {
					odd = Node.createNode(current.data);
				} else {
					Node temp = odd;
					while(temp.next != null)
						temp = temp.next;
					temp.next = Node.createNode(current.data);
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
		Node temp = head;
		while(temp.next != null)
			temp = temp.next;
		temp.next = odd;

		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(4)
				.insertData(1)
				.insertData(2)
				.insertData(7)
				.insertData(8)
				.insertData(12)
				.insertData(11)
				.insertData(14)
				.getHead();
		System.out.println(linkedList);

		head = segregateEvenOdd(head);
		SinglyLinkedList.traverse(head);
	}
}