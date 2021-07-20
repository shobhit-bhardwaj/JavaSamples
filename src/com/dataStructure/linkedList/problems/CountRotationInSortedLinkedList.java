package com.dataStructure.linkedList.problems;

public class CountRotationInSortedLinkedList {
	private static Node countRotation(Node head) {
		int rotation = 0;

		Node temp;
		Node newHead = null;
		for(temp=head; temp.next!=null; temp=temp.next) {
			rotation++;
			if(temp.data > temp.next.data) {
				newHead = temp;
				System.out.println("Rotation - " + rotation);
			}
		}

		temp.next = head;
		head = newHead.next;
		newHead.next = null;

		return head;
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(13)
				.insertData(18)
				.insertData(5)
				.insertData(9)
				.insertData(11)
				.getHead();
		SinglyLinkedList.traverse(head);

		head = countRotation(head);
		SinglyLinkedList.traverse(head);
	}
}