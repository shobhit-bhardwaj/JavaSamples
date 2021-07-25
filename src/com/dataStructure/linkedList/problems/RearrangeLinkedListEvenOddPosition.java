package com.dataStructure.linkedList.problems;

public class RearrangeLinkedListEvenOddPosition {
	private static Node rearrange(Node head) {
		Node odd = head;
		Node evenHead = head.next;
		Node even = head.next;

		//while(odd != null && odd.next != null && even.next != null) {
		while(odd.next != null && odd.next.next != null) {
			odd.next = odd.next.next;
			odd = odd.next;

			even.next = even.next.next;
			even = even.next;
		}

		odd.next = evenHead;

		return head;
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				//.insertData(60)
				.getHead();
		SinglyLinkedList.traverse(head);

		head = rearrange(head);
		SinglyLinkedList.traverse(head);
	}
}