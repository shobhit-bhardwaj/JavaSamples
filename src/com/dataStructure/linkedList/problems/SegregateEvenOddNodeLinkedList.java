package com.dataStructure.linkedList.problems;

public class SegregateEvenOddNodeLinkedList {
	private static Node segregateEvenOdd(Node head) {
		Node odd = null;

		Node prev = null;
		Node node = head;

		while(node != null ) {
			if(node.data%2 == 1) {
				if(prev == null)
					head = head.next;
				else
					prev.next = prev.next.next;

				Node temp = node;
				node = node.next;
				temp.next = null;

				if(odd == null)
					odd = temp;
				else {
					Node traverse;
					for(traverse=odd; traverse.next!=null; traverse=traverse.next);
					traverse.next = temp;
				}
			} else {
				prev = node;
				node = node.next;
			}
		}

		node = head;
		while(node.next != null)
			node = node.next;
		node.next = odd;

		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(1)
				.insertData(2)
				.insertData(3)
				.insertData(3)
				.insertData(4)
				.insertData(4)
				.insertData(5)
				.insertData(6)
				.insertData(7)
				.insertData(8)
				.insertData(9)
				.insertData(9)
				.insertData(10)
				.insertData(10)
				.getHead();
		System.out.println(linkedList);

		head = segregateEvenOdd(head);
		SinglyLinkedList.traverse(head);
	}
}