package com.dataStructure.linkedList.problems;

public class MergeAtAlternatePosition {
	private static Node mergeAtAlternate(Node head1, Node head2) {
		Node head = head1;

		Node pCurr = head1;
		Node qCurr = head2;
		while(pCurr != null && qCurr != null) {
			Node pNext = pCurr.next;
			Node qNext = qCurr.next;
			qCurr.next = pNext;
			pCurr.next = qCurr;
			pCurr = pNext;
			qCurr = qNext;
		}

		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head1 = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.getHead();
		System.out.println(linkedList);

		linkedList = new SinglyLinkedList();
		Node head2 = linkedList.insertData(60)
				.insertData(70)
				.insertData(80)
				.insertData(90)
				.getHead();
		System.out.println(linkedList);

		Node head = mergeAtAlternate(head1, head2);
		SinglyLinkedList.traverse(head);
	}
}