package com.dataStructure.linkedList.problems;

public class MergeTwoSortedListReturnReverseList {
	private static Node mergeAndReverse(Node head1, Node head2) {
		Node head = null;
		if(head1.data < head2.data) {
			head = head1;
			head1 = head1.next;
		} else {
			head = head2;
			head2 = head2.next;
		}

		Node node = head;
		while(head1 != null && head2 != null) {
			if(head1.data < head2.data) {
				node.next = head1;
				head1 = head1.next;
			} else {
				node.next = head2;
				head2 = head2.next;
			}
			node = node.next;
		}

		if(head1 != null)
			node.next = head1;
		if(head2 != null)
			node.next = head2;

		Node prev = null;
		Node current = head;
		Node next;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;

		return head;
	}

	public static void main(String[] args) {
		Node head1 = new SinglyLinkedList()
				.insertData(10)
				.insertData(30)
				.insertData(50)
				.insertData(70)
				.insertData(90)
				.getHead();
		SinglyLinkedList.traverse(head1);

		Node head2 = new SinglyLinkedList()
				.insertData(20)
				.insertData(40)
				.insertData(60)
				.insertData(80)
				.getHead();
		SinglyLinkedList.traverse(head2);

		Node head = mergeAndReverse(head1, head2);
		SinglyLinkedList.traverse(head);
	}
}