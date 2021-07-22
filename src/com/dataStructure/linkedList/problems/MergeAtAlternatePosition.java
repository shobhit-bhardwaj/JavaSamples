package com.dataStructure.linkedList.problems;

public class MergeAtAlternatePosition {
	private static Node mergeAtAlternate(Node head1, Node head2) {
		Node node1 = head1;
		Node node2 = head2;
		Node temp1, temp2;
		while(node1 != null && node1.next != null) {
			temp1 = node1.next;
			temp2 = node2.next;

			node2.next = node1.next;
			node1.next = node2;

			node1 = temp1;
			node2 = temp2;
		}

		return head1;
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

		Node head = mergeAtAlternate(head1, head2);
		SinglyLinkedList.traverse(head);
	}
}