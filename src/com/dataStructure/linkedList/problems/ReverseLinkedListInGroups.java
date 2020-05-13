package com.dataStructure.linkedList.problems;

public class ReverseLinkedListInGroups {
	private static Node reverseInGroups(Node head, int k) {
		Node tail = null;
		int counter = 0;

		Node prev = null;
		Node current = head;
		Node next = null;
		while(current != null) {
			if(counter == k) {
				if(tail == null)
					tail = prev;
				else {
					Node temp;
					for(temp=tail; temp.next!=null; temp=temp.next);
					temp.next = prev;
				}
				prev = null;
				counter = 0;
			}

			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			counter ++;
		}

		if(prev != null) {
			Node temp;
			for(temp=tail; temp.next!=null; temp=temp.next);
			temp.next = prev;
		}

		return tail;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(1)
				.insertData(2)
				.insertData(3)
				.insertData(4)
				.insertData(5)
				.insertData(6)
				.insertData(7)
				.insertData(8)
				.insertData(9)
				.insertData(10)
				.getHead();
		System.out.println(linkedList);

		head = reverseInGroups(head, 4);
		SinglyLinkedList.traverse(head);
	}
}