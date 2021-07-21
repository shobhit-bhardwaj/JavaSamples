package com.dataStructure.linkedList.problems;

public class DeleteLastOccurenceElement {
	private static Node delete(Node head, int data) {
		Node prev = head;
		Node node = head;

		while(node.next != null) {
			if(node.next.data == data)
				prev = node;

			node = node.next;
		}

		if(prev == head)
			head = head.next;
		else if(prev != null)
			prev.next = prev.next.next;

		return head;
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				//.insertData(30)
				.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.insertData(30)
				.insertData(60)
				.insertData(70)
				//.insertData(30)
				.getHead();
		SinglyLinkedList.traverse(head);

		head = delete(head, 30);
		SinglyLinkedList.traverse(head);
	}
}