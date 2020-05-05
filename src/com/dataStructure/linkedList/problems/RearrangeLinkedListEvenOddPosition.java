package com.dataStructure.linkedList.problems;

public class RearrangeLinkedListEvenOddPosition {
	private static Node rearrange(Node head) {
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
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.insertData(60)
				.getHead();
		System.out.println(linkedList);

		head = rearrange(head);
		SinglyLinkedList.traverse(head);
	}
}