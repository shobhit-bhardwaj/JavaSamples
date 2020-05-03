package com.dataStructure.linkedList.problems;

public class PalindromLinkedList {
	private static boolean temp(Node head) {
		//	Find Middle of Linked List
		Node slow = head;
		Node slowPrev = null;
		Node fast = head;
		while(fast != null && fast.next != null) {
			slowPrev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}

		//	This id for Odd Size List
		Node middle = null;
		if(fast != null) {
			middle = slowPrev;
			slowPrev = slowPrev.next;
		}

		//	Divide List into Two List
		Node head1 = head;
		Node head2 = slowPrev.next;
		slowPrev.next = null;
		if(middle != null)
			middle.next = null;

		//	Reversing Linked List
		Node prev = null;
		Node current = head1;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head1 = prev;

		//	Comparing Linked List
		Node first = head1;
		Node second = head2;
		while(first != null && second != null) {
			if(first.data != second.data)
				return false;

			first = first.next;
			second = second.next;
		}

		if(first != null)
			return false;

		if(second != null)
			return false;

		return true;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				//.insertData(50)
				.insertData(40)
				.insertData(30)
				.insertData(20)
				.insertData(10)
				.getHead();
		System.out.println(linkedList);

		boolean palindrom = temp(head);
		System.out.println("Palindrom - " + palindrom);
	}
}